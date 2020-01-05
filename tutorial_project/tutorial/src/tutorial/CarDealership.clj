(ns tutorial.CarDealership)

(defn carPrices
  "returns car prices regarding the budget and the validity of the coupons given"
  [budget coupon]
  (def carStore {"bmw"  60000, "ferrari" 100000, "fiat" 20000})
  (def couponValid (checkCouponValidity coupon))
  (if (= couponValid true)
    (do
       (println "The coupon" coupon "is valid")
       (doseq [car carStore]
         (def carType (first car))
         (def price (last car))
         (def priceDiscount (* price 0.8))
         (if (<= priceDiscount budget)
            (println "The" carType "costs" priceDiscount))
        )
       )
    (do
      (println "The coupon" coupon "is invalid")
      (doseq [car carStore]
        (def carType (first car))
        (def price (last car)))
      (if (<= priceDiscount budget)
        (println "The" carType "costs" price))
      )
  ))

(defn checkCouponValidity
  "returns True if the coupon is valid"
  [coupon]
  (= coupon "20%DISCOUNT"))



(defn applyCoupon
  "returns a vector with the new car prices"
  [prices]
  (def discountPrices (seq []))
  (doseq [x prices]
    ((conj discountPrices (* x 0.8)))
    ))

(carPrices 80000 "20%DISCOUNT")
