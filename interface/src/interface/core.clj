(ns interface.core
  (:gen-class))

;; (defn -main
;;   "I don't do a whole lot ... yet."
;;   [& args]
;;   (println "Hello, World!"))

(defn opcao1 []
  (println "Valor:")
  (def valor (read))
  (println "Tipo:")
  (def tipo (read))
  (println {:valor valor :tipo tipo}))
  

(defn opcao2 []
  (println "Exibir transações"))

(defn opcao3 []
  (println "Registrar transações"))

(defn opcao4 []
  (println "exibir blockchain"))

(defn mostrar-menu []
  (println "\nMenu:")
  (println "1. Opção 1")
  (println "2. Opção 2")
  (println "3. Opção 3")
  (println "4. Opcao 4")
  (println "5. Opcao 5"))

(defn handle-escolha [escolha]
  (cond
    (= escolha "1") (opcao1)
    (= escolha "2") (opcao2)
    (= escolha "3") (opcao3)
    (= escolha "4") (opcao4)
    (= escolha "5") (println "Saindo...")
    :else (println "Opção inválida. Tente novamente.")))

(defn -main [& args]
  (loop []
    (mostrar-menu)
    (let [escolha (read-line)]
      (handle-escolha escolha)
      (when (not= escolha "4")
        (recur)))))

;;(-main)
