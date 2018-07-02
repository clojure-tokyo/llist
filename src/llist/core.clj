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
(defn llen [x]
  (if (lempty? x)
      0
      (+ 1 (llen (lnext x)))))
(defn lcons [e l] [e l])
