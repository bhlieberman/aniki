(ns bhlieberman.polly
  (:require [cognitect.aws.client.api :as aws]
            [cognitect.aws.credentials :as creds]
            [clojure.pprint :as pp]
            [clojure.java.io :as jio]))

(def polly (aws/client {:api :polly
                        :credentials-provider
                        (creds/profile-credentials-provider "jamf")}))

(def hello-response
  (aws/invoke polly {:op :SynthesizeSpeech
                     :request {:VoiceId "Amy"
                               :Text "Hello World!"
                               :OutputFormat "mp3"}}))

(def corn (apply str (map char [\u3068 \u3045 \u3082 \u308D \u3053 \u3057])))

(def corn-response
  (aws/invoke polly {:op :SynthesizeSpeech
                     :request {:VoiceId "Mizuki"
                               :Text corn
                               :LanguageCode "ja-JP"
                               :OutputFormat "mp3"}}))

(with-open [os (jio/output-stream (jio/resource "corn-ja.mp3"))
            is (jio/input-stream (:AudioStream corn-response))]
  (jio/copy is os))