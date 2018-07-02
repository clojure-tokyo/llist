(ns llist.core)

; car first
; cdr rest
; cadr

;(defn lnext [x] (second x))
;(defn lnext2 [[x & xs]] xs)
;(defn lnext3 [[_ _ & xs]] xs)
(defn lfirst [llist] (let [[x _]  llist] x))
(defn lnext  [llist] (let [[_ xs] llist] xs))
(defn lempty [])
(defn lempty?  [x] (= (lempty) x))
(defn llen
  ([x]
   (llen x 0))
  ([x acc]
   (if (lempty? x)
      acc
      (recur (lnext x) (inc acc)))))

(defn lcons [e l] [e l])

(defn lrepeat
  ([n e]
   (lrepeat n e (lempty)))
  ([n e acc]
   (if (zero? n)
      acc
      (recur (dec n) e (lcons e acc)))))
