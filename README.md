# 🎬 ScreenMatch

Projeto desenvolvido em Java para modelagem e avaliação de filmes, focado no aprendizado de Orientação a Objetos.

## 📝 Descrição

O **ScreenMatch** é uma aplicação que permite registrar filmes, atribuir avaliações e calcular a média das notas recebidas. O projeto demonstra conceitos fundamentais como classes, objetos, encapsulamento e métodos.

## ✨ Funcionalidades

- **Cadastro de Filmes:** Definição de nome, ano de lançamento e inclusão no plano.
- **Sistema de Avaliação:** Permite adicionar múltiplas notas a um filme.
- **Cálculo de Média:** Calcula automaticamente a média das avaliações registradas.
- **Ficha Técnica:** Exibe os dados principais do título.

## 🛠️ Tecnologias

- Java

## 🚀 Como executar

1. Certifique-se de ter o Java instalado.
2. Compile os arquivos na pasta `src`.
3. Execute a classe `Principal`.

## Dependencias (Gson)

O projeto usa o Gson via JAR local em `lib/gson-2.13.2.jar`. O VS Code ja esta configurado para carregar JARs de `lib/**`.

Compilar (Windows PowerShell):

```powershell
javac -cp "lib/*" -d bin src\br\com\alura\screenmatch\**\*.java
```

Executar (exemplo):

```powershell
java -cp "lib/*;bin" br.com.alura.screenmatch.principal.PrincipalComBusca
```

