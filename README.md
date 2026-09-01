# 🏫 Sistema de Gerenciamento Escolar em Java

Um sistema via terminal desenvolvido em Java para automatizar o cadastro de alunos, consulta de registros e gerenciamento do desempenho acadêmico (média trimestral, faltas e exames de recuperação).

---

## 🎯 Sobre o Projeto

O objetivo deste projeto foi aplicar na prática os conceitos fundamentais da **Programação Orientada a Objetos (POO)** e a manipulação de coleções de dados dinâmicas utilizando `ArrayList`, mantendo o código estruturado, limpo e de fácil leitura.

---

## 🛠️ Tecnologias Utilizadas

* **Linguagem:** Java (JDK 20+)
* **IDE:** IntelliJ IDEA
* **Estrutura de Dados:** `ArrayList`
* **Entrada de Dados:** `Scanner`

---

## ⚙️ Funcionalidades

1. **Cadastrar Aluno:** Registra informações do aluno (nome, CPF, data de nascimento, e-mail, telefone) e dados dos responsáveis.
2. **Listar Alunos:** Exibe a lista completa com nome e CPF de todos os alunos cadastrados no repositório.
3. **Buscar por CPF:** Localiza um aluno específico através do seu número de CPF.
4. **Calcular Status / Média:** 
   * Recebe as notas dos três trimestres e o total de faltas.
   * Calcula a média aritmética e avalia a situação (Aprovado, Reprovado por Faltas, Reprovado ou Recuperação).
   * Processa a nota do exame de recuperação, determinando o status final do aluno.

---

## 📁 Estrutura das Classes

```text
src/
 └── sistema/
      └── escola/
           ├── Aluno.java           # Modelo com os atributos, getters, setters e construtor
           ├── AlunoRepository.java # Gerenciamento do armazenamento e busca (ArrayList)
           ├── AlunoService.java    # Regras de negócio (cálculo de média e status)
           └── Main.java            # Interface no terminal e menu iterativo (switch-case)
