# clj-oss-117

A Clojure library to interact with aliyuncs oss (object storage) equivalent to aws s3.

## Usage

```clojure
;;in project.clj
[oss-117 "0.1.0"]
;; in your ns
(ns my.ns
  (:require [oss.core :as oss]))
```

### OSS Client

```clojure
;;Create an oss client
(def client (mk-oss-client "oss-endpoint" "***Access-key***" "***Secret-key***"))
;;shut oss client
(shut-client client)
```

### Bucket Operations
```clojure
;;Create a new bucket
(create-bucket client "your-bucket-name")
;;get bucket information
(get-bucket-info client "your-bucket-name")
;;Delete a bucket
(delete-bucket client "your-bucket-name")
```

### Object Operations
```clojure
;;Create a new object from file
(put-file client "your-bucket-name" "your-key-file" (file "filepath"))
;; put an utf-8 string
(put-string client "your-bucket-name" "your-key-string" "the string you want to store into oss")
;;put an object as input stream
(put-object client "your-bucket-name" "your-key-object" input-stream)


;;get-object
(get-object client "your-bucket-name" "your-key-object")
;;get-string
(get-string client "your-bucket-name" "your-key-string")

;;Deletion
(delete-object client "your-bucket-name" "your-key-object")
```

## License

Copyright © 2017 Linkfluence SAS / Jean-Baptiste Besselat

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
