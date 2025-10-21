# Primeiros Passos com Java no VS Code

Bem-vindo ao mundo Java no VS Code! Este guia ajudará você a começar a desenvolver em Java usando o Visual Studio Code.

## Pré-requisitos

1. Java Development Kit (JDK) instalado
   - Recomendado: JDK 11 ou superior
   - Variável JAVA_HOME configurada
   - `java` e `javac` no PATH do sistema

2. Visual Studio Code com extensões:
   - Extension Pack for Java
   - Debugger for Java
   - Test Runner for Java

## Estrutura do Projeto

O workspace contém as seguintes pastas e arquivos:

- 📁 `src/` - Arquivos fonte Java (.java)
- 📁 `lib/` - Bibliotecas e dependências externas (.jar)
- 📁 `bin/` - Arquivos compilados (.class)
- 📄 `.vscode/` - Configurações do VS Code
  - `settings.json` - Preferências do projeto
  - `launch.json` - Configurações de depuração

> **Dica**: Para personalizar a estrutura, edite `.vscode/settings.json`

## Como Usar

### Compilar

1. No VS Code, pressione `Ctrl+Shift+B` ou:

   ```bash
   # Na raiz do projeto:
   javac -d ./bin ./src/*.java
   ```

### Executar

1. Via VS Code:
   - Abra um arquivo .java
   - Clique no ▶️ (Run) acima do método main

2. Via terminal:

   ```bash
   # Substitua MainClass pela sua classe principal
   java -cp ./bin MainClass
   ```

### Depurar (Debug)

1. Coloque breakpoints (🔴) clicando à esquerda do número da linha
2. Pressione F5 ou clique em Run > Start Debugging

## Gerenciamento de Dependências

Use a visualização `JAVA PROJECTS` para:

- Adicionar JARs externos
- Gerenciar módulos/bibliotecas
- Ver a estrutura do projeto

[📘 Documentação Completa](https://github.com/microsoft/vscode-java-dependency#manage-dependencies)

## Dicas Úteis

- `F5` - Iniciar depuração
- `Ctrl+F5` - Executar sem depuração
- `Ctrl+Shift+P` - Abrir paleta de comandos
  - Digite "Java: " para ver todos os comandos disponíveis

## Ajuda & Recursos

- [🔗 Java no VS Code](https://code.visualstudio.com/docs/languages/java)
- [🔗 Depuração Java](https://code.visualstudio.com/docs/java/java-debugging)
- [🔗 Testes com JUnit](https://code.visualstudio.com/docs/java/java-testing)
