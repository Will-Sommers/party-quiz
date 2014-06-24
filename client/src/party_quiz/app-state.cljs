(ns party-quiz.app-state)

(def app-state (atom {:board {:name "Example Board"
                              :example? true
                              :columns [{:name "What is in a Yarr"
                                         :cards [{:question "Hello"
                                                       :answer "Good bye"
                                                       :value 200}
                                                      {:question "Hello"
                                                       :answer "Good bye"
                                                       :value 400}
                                                      {:question "Hello"
                                                       :answer "Good bye"
                                                       :value 600}
                                                      {:question "Hello"
                                                       :answer "Good bye"
                                                       :value 800}
                                                      {:question "Hello"
                                                       :answer "Good bye"
                                                       :value 1000}]}
                                        {:name "Potent Potables"
                                         :cards [{:question "Hello"
                                                       :answer "Good bye"
                                                       :value 200}
                                                      {:question "Hello"
                                                       :answer "Good bye"
                                                       :value 400}
                                                      {:question "Hello"
                                                       :answer "Good bye"
                                                       :value 600}
                                                      {:question "Hello"
                                                       :answer "Good bye"
                                                       :value 800}
                                                      {:question "Hello"
                                                       :answer "Good bye"
                                                       :value 1000}]}
                                        {:name "Potent Potables"
                                         :cards [{:question "Hello"
                                                       :answer "Good bye"
                                                       :value 200}
                                                      {:question "Hello"
                                                       :answer "Good bye"
                                                       :value 400}
                                                      {:question "Hello"
                                                       :answer "Good bye"
                                                       :value 600}
                                                      {:question "Hello"
                                                       :answer "Good bye"
                                                       :value 800}
                                                      {:question "Hello"
                                                       :answer "Good bye"
                                                       :value 1000}]}
                                        {:name "Potent Potables"
                                         :cards [{:question "Hello"
                                                       :answer "Good bye"
                                                       :value 200}
                                                      {:question "Hello"
                                                       :answer "Good bye"
                                                       :value 400}
                                                      {:question "Hello"
                                                       :answer "Good bye"
                                                       :value 600}
                                                      {:question "Hello"
                                                       :answer "Good bye"
                                                       :value 800}
                                                      {:question "Hello"
                                                       :answer "Good bye"
                                                       :value 1000}]}
                                        ]}
                      :card-bank [{:question "Hello"
                                   :answer "Good bye"}]}))
