# Peepo Clicks - A jornada para o sorriso

Projeto simples feito em **Java**, utilizando **Swing, HTML e CSS** para a interface gráfica. O jogo é uma versão temática do **COOKIE CLICKER**, com sistema de **upgrades ativos, passivos e multiplicadores**, além de **suporte a saves  e sistema de banco de dados MySQL**.

---

## 🎮 Objetivo

Clicar o máximo que puder para acumular pontos, comprar melhorias e desbloquear partes da história, deixando o Peepo cada vez mais **FELIZ!**

---

## 🧠 Funcionalidades

- Sistema de clique principal
- Upgrades ativos, passivos e multiplicadores
- História desbloqueável conforme o progresso
- Interface gráfica em Java Swing, HTML e CSS
- Sistema de save
- Banco de dados para persistência dos saves
- Contador de pontos em tempo real
- Botões com feedback visual

---

## 📦 Estrutura do Projeto

| Arquivo/Pacote                     | Descrição |
|-----------------------------------|-----------|
| Jogo.java                         | Tela principal do jogo com cliques e upgrades |
| Menu.java                         | Tela inicial com botão de "Jogar", "Continuar" e "Sair" |
| Continuar.java                    | Lógica de salvamento e carregamento de dados no banco |
| Banco/Conexao.java                | Conexão com o banco de dados via JDBC |
| assets/                           | Pasta de recursos (imagens, etc.) |
| Banco/                            | Pacote com classes de persistência de dados |

---

## 🖥️ Tecnologias Utilizadas

- Java JDK 8+
- Swing (Interface Gráfica)
- HTML (Interface Gráfica)
- CSS (Interface Gráfica)
- JDBC (Conexão com banco MySQL)
- MySQL (Banco de dados relacional)
- NetBeans (Editor usado no desenvolvimento)

---

## 🔧 Como Executar

1. Clone ou baixe o repositório do GitHub:
   https://github.com/Rodrigocm07/PeepoClicks

2. Importe o projeto no NetBeans ou outro editor de sua preferência.

3. Configure o banco de dados:
   - Crie um banco MySQL com a estrutura definida no projeto.
   - Atualize os dados de conexão em Banco/Conexao.java.

4. Adicione o driver JDBC (MySQL Connector) ao projeto.

5. Compile e execute a classe Menu.java.

---

## 🙌 Créditos

Desenvolvido por Rodrigo C. M.  
Com inspiração no clássico Cookie Clicker e apoio de Luís Guilherme de S Lopes
