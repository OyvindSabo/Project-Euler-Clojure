(defn sum-end [vector] (conj vector (+ (last vector) (last (butlast vector)))))

(defn sum-of-even-fib-array-lower-than [number]
  (apply +
    (filter #(zero? (rem % 2))
      (butlast
        (loop [vector [1 2]]
          (if (> (last vector) number)
            vector
            (recur
              (sum-end vector)
            )
          )
        )
      )
    )
  )
)

;; Project Euler 02
(println (sum-of-even-fib-array-lower-than 4000000)) ;; => 4613732