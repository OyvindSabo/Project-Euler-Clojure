(apply + (filter
  #(zero? (* (rem % 3) (rem % 5))) 
  (range 1000)))

;; => 233168