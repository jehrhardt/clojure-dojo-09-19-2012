(ns bowling-game.core)

(defn frame [game]
  ((fn [myseq restgame]
    (if restgame
    (recur 
       (conj myseq (seq [(first restgame) (second restgame)])) 
       (nnext restgame))
     myseq))
  (seq []) game))

(defn score [game]
  ((fn [sum list]
     (if (empty? list)
       sum
       (recur (+ sum (first list)) (rest list)))) 0 game))