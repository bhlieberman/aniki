(ns bhlieberman.aniki.polly
  (:require [cognitect.aws.client.api :as aws]
            [cognitect.aws.credentials :as creds]
            [clojure.pprint :as pp]
            [clojure.java.io :as jio]))

(def polly (aws/client {:api :polly
                        :credentials-provider
                        (creds/profile-credentials-provider "jamf")}))

(def corn (apply str (map char [\u3068 \u3045 \u3082 \u308D \u3053 \u3057])))

(defmulti get-mp3 class)
(defmethod get-mp3 java.io.File [f]
  (let [resp (aws/invoke polly {:op :SynthesizeSpeech
                                :request {:VoiceId "Mizuki"
                                          :Text corn
                                          :LanguageCode "ja-JP"
                                          :OutputFormat "mp3"}})]
    (with-open [os (jio/output-stream f)
                is (jio/input-stream (:AudioStream resp))]
      (jio/copy is os))))

(get-mp3 (jio/as-file (jio/resource "corn-ja.mp3")))