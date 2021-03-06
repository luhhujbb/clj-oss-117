(defproject luhhujbb/oss-117 "0.1.3"
  :description "Aliyun simple object storage client"
  :url "https://github.com/luhhujbb/clj-oss-117"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
            :dependencies [[org.clojure/clojure "1.8.0"]
                           [org.clojure/java.data "0.1.1"]
                           ;; logging stuff
                           [org.clojure/tools.logging "0.3.1"]
                           [org.slf4j/slf4j-api "1.7.19"]
                           [org.slf4j/slf4j-log4j12 "1.7.19"]
                           [org.slf4j/jcl-over-slf4j "1.7.19"]
                           [log4j "1.2.17"]
                            ;;alicloud oss
                           [com.aliyun.oss/aliyun-sdk-oss "2.8.3"]]
   :profiles {:uberjar {:aot :all}
              :dev {:aot :all}})
