(ns llist.core)

; car first
; cdr rest
; cadr

;(defn lrest [x] (second x))
;(defn lrest2 [[x & xs]] xs)
;(defn lrest3 [[_ _ & xs]] xs)
(defn lrest [l] (let [[_ xs] l] xs))
(defn lempty [])
(defn lempty?  [x] (= (lempty) x))
(defn llen [x] (if (= (lempty) x) 0 1))
(defn lcons [e l] [e l])

