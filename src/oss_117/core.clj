(ns oss-117.core)

(defn mk-oss-client
  [region ak sk])

;;basic bucket operation

(defn create-buckect
  [client bucket-name])

(defn list-buckets
  [client])

(defn delete-bucket
  [client bucket-name])

;;basic object operation

(defn put-object
  [client bucket-name key data])

(defn append-object
  [client bucket-name key data])

(defn get-object
  [client bucket-name key])

(defn delete-object
  [cleint bucket-name key])
