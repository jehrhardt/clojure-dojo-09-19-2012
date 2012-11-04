(ns bowling-game.core-test
  (:require [bowling-game.test-games :as game])
  (:use midje.sweet
        bowling-game.core))

(fact (score (repeat 20 0)) => 0)

(fact (frame (repeat 10 0)) => (just ((0 0) (0 0) (0 0) (0 0) (0 0))))

(fact (score (repeat 20 4)) => 80)

(fact (score (repeat 12 10)) => 300)