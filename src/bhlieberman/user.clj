(ns bhlieberman.user
  (:require [clojure.pprint :as pp]))

(def vowels
  #:com.bhlieberman.aniki.hiragana{:A \u3042,
                                   :I \u3044,
                                   :O \u304A,
                                   :U \u3046,
                                   :a \u3041,
                                   :e \u3047,
                                   :E \u3048,
                                   :i \u3043,
                                   :o \u3049,
                                   :u \u3045})

(def ks
  #:com.bhlieberman.aniki.hiragana{:ki \u304D
                                   :ka \u304B
                                   :ku \u304F
                                   :ke \u3051
                                   :ko \u3053})

(def ^{:compound [:gu :ge :go]} gs
  #:com.bhlieberman.aniki.hiragana{:ga \u304C
                                   :gi \u304E
                                   :gu \u3050
                                   :ge \u3052
                                   :go \u3054})

(def ss
  #:com.bhlieberman.aniki.hiragana{:sa \u3055
                                   :si \u3057
                                   :su \u3059
                                   :se \u305B
                                   :so \u305D})

(def ^{:compound [:za :zi :zu :ze :zo]
       :not-unique [:zi]} zs
  #:com.bhlieberman.aniki.hiragana{:za \u3056
                                   :zi \u3058
                                   :zu \u305A
                                   :ze \u305C
                                   :zo \u305E})

(def ts
  #:com.bhlieberman.aniki.hiragana{:ta \u305F
                                   :ti \u3061
                                   :tu-tsu \u3063
                                   :TU-TSU \u3064
                                   :te \u3066
                                   :to \u3068})