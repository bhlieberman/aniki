(ns bhlieberman.aniki.hiragana
  {:doc "Mappings from keyword representations of Romaji to the Unicode code points for their corresponding Hiragana characters."})

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

(def ens
  #:com.bhlieberman.aniki.hiragana{:na \u306A
                                   :ni \u306B
                                   :nu \u306C
                                   :ne \u306D
                                   :no \u306E})

(def hs
  #:com.bhlieberman.aniki.hiragana{:ha \u306F
                                   :hi \u3072
                                   :hu \u3075
                                   :he \u3078
                                   :ho \u307B})

(def ms
  #:com.bhlieberman.aniki.hiragana{:ma \u307E
                                   :mi \u307F
                                   :mu \u3080
                                   :me \u3081
                                   :mo \u3082})

(def ys
  #:com.bhlieberman.aniki.hiragana{:ya \u3083
                                   :YA \u3084
                                   :yu \u3085
                                   :YU \u3086
                                   :yo \u3087
                                   :YO \u3088})

(def rs
  #:com.bhlieberman.aniki.hiragana{:ra \u3089
                                   :ri \u308A
                                   :ru \u308B
                                   :re \u308C
                                   :ro \u308D})

(def ws
  #:com.bhlieberman.aniki.hiragana{:wa \u308E
                                   :WA \u308F
                                   :wi \u3090
                                   :we \u3091
                                   :wo \u3092
                                   :n \u3093})

ws