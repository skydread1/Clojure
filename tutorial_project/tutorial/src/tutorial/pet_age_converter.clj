(ns tutorial.pet-age-converter
  (:gen-class))



(defn ageConverter
  "returns the age of the pet in human years"
  [x]
  (def petStore {'dog 7, 'cat 5, 'goldfish 10})
  (get petStore x))

(defn age
  "returns the age in years of a specific pet"
  [petName petType petAge]
  (def ratio (ageConverter petType))
  (println "Your" petType "named" petName "is" (* petAge ratio)))

(age "Bob" 'dog 10)
(age "Alice" 'cat 10)
(age "Eric" 'goldfish 10)
