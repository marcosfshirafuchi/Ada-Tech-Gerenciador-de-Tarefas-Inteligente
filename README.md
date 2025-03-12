# <a href="https://imgbb.com/"><img src="https://i.ibb.co/wNCRx9z/image-2025-01-04-T23-13-02-901-Z.png" alt="image-2025-01-04-T23-13-02-901-Z" border="0" width =150 heigth = 100></a> Desenvolva + : Gerenciador de Tarefas Inteligente

#### Desenvolvido na linguagem Java por:
- [Aline Wornath](https://github.com/AlineWornath)
- [Bruno Madureira](https://github.com/brumadu)
- [Marcos Shirafuchi](https://github.com/marcosfshirafuchi)

# Principais Tecnologias

- <img width="70px" src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/java/java-original-wordmark.svg" title = "Java" /> <b>Java 21 :</b> Utilizaremos a versão LTS mais recente do Java para tirar vantagem das últimas inovações que essa linguagem robusta e amplamente utilizada oferece;
- <img width="70px" src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/intellij/intellij-original.svg" title = "IntelliJIDEA" /> <b>IntelliJIDEA :</b> Utilizei o IntelliJIDEA como a IDEA para fazer os programas em Java;

# 📌 Desafio: Gerenciador de Tarefas Inteligente

## 📍 Contexto

Imagine que você foi contratado por uma startup que deseja desenvolver um **Gerenciador de Tarefas Inteligente** para ajudar profissionais a organizarem melhor seu dia a dia.  

O objetivo é criar uma aplicação capaz de **cadastrar, listar e filtrar tarefas**, garantindo uma experiência simples e eficiente.  

---

Além disso, o sistema deve oferecer suporte para **notificações automáticas** sobre prazos próximos, ajudando os usuários a manterem suas atividades sob controle.  

Seu desafio é desenvolver essa solução utilizando **Java**, aplicando conceitos modernos de **programação funcional, manipulação de datas e concorrência** para tornar o sistema rápido e eficiente.  

---

## 🎯 Requisitos do Projeto

A aplicação deve permitir que os usuários realizem as seguintes operações:

### ✅ Cadastro de Tarefas  
- Cada tarefa deve conter: **título, descrição, data limite (deadline) e status** (`Pendente`, `Em andamento`, `Concluído`).  
- O sistema deve garantir que **nenhuma tarefa seja cadastrada com data limite no passado**.  

### ✅ Gerenciamento e Filtragem  
- Exibir **todas as tarefas cadastradas**.  
- Permitir **filtrar tarefas por status**.  
- Listar as tarefas **ordenadas por data limite**.  

---

### ✅ Validação e Qualidade dos Dados  
- Evitar que **tarefas com títulos muito curtos** sejam cadastradas.  
- Garantir que **nenhuma tarefa seja salva sem um status válido**.  

### ✅ Notificações Inteligentes  
- O sistema deve alertar automaticamente o usuário **quando uma tarefa estiver próxima da data limite**.  

---

## 🛠 Tecnologias e Conceitos Esperados

Para resolver esse desafio, recomenda-se o uso dos seguintes recursos:

📌 **Manipulação de Datas:** Uso da API `java.time` para lidar com datas e prazos.  
📌 **Programação Funcional:** Uso de `Streams`, `Optional` e `Predicate` para processar e validar as tarefas.  
📌 **Execução Assíncrona:** Uso de `CompletableFuture` para implementar notificações automáticas.  

---

🚀 **O projeto será desenvolvido inteiramente durante as aulas**, em um total de **6 horas**, com cada funcionalidade sendo implementada de forma incremental.

Boa sorte e mãos à obra! 💻🔥

## Diagrama de classes
