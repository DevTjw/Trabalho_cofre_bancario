
# 💱 Conversor de Moedas em Java

![Status](https://img.shields.io/badge/status-active-brightgreen)
![Java](https://img.shields.io/badge/Java-17+-red)
![License](https://img.shields.io/badge/license-MIT-blue)

Um projeto desenvolvido em Java para demonstrar conceitos fundamentais de **Programação Orientada a Objetos (POO)**, utilizando **abstração, herança e polimorfismo** para implementar um sistema simples e eficiente de conversão de moedas.

---

## 🧩 **Visão Geral**

Este projeto apresenta uma estrutura modular onde diferentes moedas são representadas por classes específicas que herdam de uma classe base abstrata.
A aplicação permite converter valores utilizando a taxa de câmbio definida em cada moeda, além de facilitar a expansão para novas implementações.

---

## 📂 **Estrutura do Projeto**

```
📦 ConversorMoedas
 ├── Cofrinho.java
 ├── Dolar.java
 ├── Main.java
 ├── Moeda.java
 ├── Real.java
 └── Euro.java
```

### **Moeda.java**

* Classe abstrata que define a estrutura de uma moeda.
* Contém o método base para conversão (`converter()`).
* Serve como superclasse para todas as moedas específicas.

### **Real.java**

* Representa a moeda brasileira (BRL).
* Estabelece a conversão padrão para o projeto.

### **Euro.java**

* Representa a moeda Euro (EUR).
* Implementa conversão baseada em uma taxa fixa definida no código.

### **Main.java**

* Ponto de entrada da aplicação.
* Demonstra o uso das classes com conversões reais.

---

## 🚀 **Funcionalidades**

✔️ Conversão de valores entre diferentes moedas
✔️ Arquitetura orientada a objetos
✔️ Facilidade para adicionar novas moedas
✔️ Demonstração prática de herança e polimorfismo
✔️ Código claro, organizado e didático

---

## 🧠 **Conceitos de POO Aplicados**

* **Abstração** – Classe Moeda representa o conceito geral.
* **Herança** – Real e Euro estendem Moeda.
* **Polimorfismo** – O método `converter()` é implementado de maneiras diferentes.
* **Encapsulamento** – Propriedades e métodos protegidos e organizados.

---

## ▶️ **Como Executar**

Certifique-se de que o Java 17+ está instalado.

### **1. Compile:**

```bash
javac *.java
```

### **2. Execute:**

```bash
java Main
```

---

## 💻 **Exemplo de Uso (Saída Esperada)**

```text
Valor em Real: 100.0
Convertendo para Euro...
Valor convertido: 18.52 EUR
```

*(Exemplo fictício — depende da taxa configurada no código.)*

---

## 🛠️ **Tecnologias Utilizadas**

* Java 17+
* Programação Orientada a Objetos
* Terminal / JVM

---

## 📈 **Expansão do Projeto**

Você pode adicionar novas moedas criando novas classes como:

```java
public class Dolar extends Moeda {
    @Override
    public double converter(double valor) {
        return valor / 5.60; // exemplo
    }
}
```

E pronto! Está integrado ao sistema sem alterar o restante do código.

---

## 🤝 **Contribuições**

Contribuições são bem-vindas!
Sinta-se à vontade para abrir *issues* ou *pull requests*.

---

## 📄 **Licença**

Este projeto está licenciado sob a licença **MIT**.

---
