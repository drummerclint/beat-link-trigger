(defproject beat-link-trigger "0.1.2"
  :description "Trigger events in response to CDJ activity."
  :url "https://github.com/brunchboy/beat-link-trigger"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [com.fifesoft/rsyntaxtextarea "2.5.8"]
                 [com.github.insubstantial/substance "7.3"]
                 [com.taoensso/timbre "4.3.1"]
                 [environ "1.0.3"]
                 [fipp "0.6.5"]
                 [inspector-jay "0.3"]
                 [me.raynes/fs "1.4.6"]
                 [org.deepsymmetry/beat-link "0.1.7"]
                 [overtone/midi-clj "0.5.0"]
                 [overtone/osc-clj "0.9.0"]
                 [seesaw "1.4.5"]
                 [uk.co.xfactory-librarians/coremidi4j "0.7"]]

  :profiles {:dev {:repl-options {:init-ns beat-link-trigger.core
                                  :welcome (println "beat-link-trigger loaded.")}
                   :jvm-opts ["-XX:-OmitStackTraceInFastThrow"]}
             :uberjar {:aot :all}}

  :main beat-link-trigger.BeatLinkTrigger
  :uberjar-name "beat-link-trigger.jar"

  ;; Add project name and version information to jar file manifest
  :manifest {"Name" ~#(str (clojure.string/replace (:group %) "." "/")
                            "/" (:name %) "/")
             "Package" ~#(str (:group %) "." (:name %))
             "Specification-Title" ~#(:name %)
             "Specification-Version" ~#(:version %)}

  :plugins [[lein-environ "1.0.2"]]

  :min-lein-version "2.0.0")

