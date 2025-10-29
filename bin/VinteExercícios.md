# Lista de Exercícios: Algoritmos

## Professor: Ramon Hugo &nbsp; &nbsp; Semestre: 2025.2

---

## 🚀 1. Introdução (Lógica Básica e Variáveis)

| # | Título do Exercício | Objetivo | Teste de Mesa |
| :---: | :--- | :--- | :--- |
| **1** | **Conversão de Temperatura** | Elaborar fluxograma e pseudocódigo. Lê Fahrenheit e ESCREVE Celsius. | **Entrada:** 100 <br> **Saída:** 37.7778 |
| **2** | **Discriminante $\Delta$** | Elaborar fluxograma. Lê coeficientes $a, b, c$ e ESCREVE $\Delta = b^2 - 4ac$. (Assuma sem operador de exponenciação). | **Entrada:** $a=1, b=5, c=-3$ <br> **Saída:** 37 |
| **3** | **Média Simples (2 Variáveis)** | Elaborar fluxograma. Lê 4 notas e ESCREVE a média. **Restrição:** Use apenas duas variáveis. | **Entrada:** 7.0, 8.0, 6.0, 9.0 <br> **Saída:** 7.5 |

### Exercício 4: Binário para Decimal (Duas Soluções)

**Objetivo:** Elaborar pseudocódigo. Lê cinco bits (0 ou 1) do mais significativo para o menos significativo e ESCREVE o número em decimal.

1.  **Solução A:** Usar seis variáveis (uma para cada bit lido e uma para o resultado).
2.  **Solução B:** Usar apenas duas variáveis (uma para o acumulador decimal e outra para o bit lido).

| Teste de Mesa | Entrada (Bits) | Saída Esperada |
| :--- | :--- | :--- |
| **Padrão** | 1, 0, 0, 1, 1 | 19 |

### Exercício 5: Mínimo de Moedas

**Objetivo:** Elaborar pseudocódigo. Lê um valor em centavos e ESCREVE as moedas necessárias para formar esse valor, dando preferência às moedas de maior valor (50, 25, 10, 5 e 1 centavo).

| Teste de Mesa | Entrada (Centavos) | Saída Esperada (Contagem: 50, 25, 10, 5, 1) |
| :--- | :--- | :--- |
| **Padrão** | 57 | 1, 0, 0, 1, 2 |

---

## 🧭 2. Expressões Lógicas

| # | Título | Variáveis | Condições / Regras |
| :---: | :--- | :--- | :--- |
| **6** | **Aposentadoria** | `idade`, `tempo` (inteiras) | Escrever expressão lógica que assume **T** se: <br> - $\text{idade} \ge 65$ <br> **OU** $\text{tempo} \ge 30$ <br> **OU** ($\text{idade} \ge 60$ **E** $\text{tempo} \ge 25$) |
| **7** | **Vogal/Consoante** | `letra` (caractere minúsculo) | Escrever expressão lógica que assume **T** se `letra` é uma vogal (`a`, `e`, `i`, `o`, `u`). |
| **8** | **Número Especial** | $n$ (inteiro positivo) | Escrever expressão lógica que assume **T** se: <br> - ($n$ divisível por 2 **XOR** $n$ divisível por 3) <br> **E** ($n$ **NÃO** divisível por 10) |

---

## 🚦 3. Fluxo Condicional (Estruturas `SE`/`IF`)

### Exercício 9: Maior de Três Números

**Objetivo:** Elaborar pseudocódigo e fluxograma. Lê três números reais e ESCREVE o maior deles.

| Teste | Entrada (a, b, c) | Saída Esperada |
| :--- | :--- | :--- |
| **(a)** | 1.0, 2.5, 4.0 | 4.0 |
| **(b)** | 5.0, 2.5, 4.0 | 5.0 |
| **(c)** | 1.0, 6.3, 0.5 | 6.3 |
| **(d)** | 1.0, 2.6, 2.6 | 2.6 |

### Exercício 10: Remuneração de Vendedor

**Objetivo:** Elaborar pseudocódigo. Lê total de vendas e avaliação (0 a 10) e ESCREVE a remuneração final.

| Regras | Salário Fixo: R$ 2000,00 | Comissão: 5% (< R$ 10000) / 7% ($\ge$ R$ 10000) | Bônus: + R$ 500,00 (se Avaliação $\ge 8$) |
| :--- | :--- | :--- | :--- |
| **Teste 1** | **Entrada:** 5000, 7 | **Saída:** R$ 2250,00 |
| **Teste 2** | **Entrada:** 15000, 8 | **Saída:** R$ 3550,00 |
| **Teste 3** | **Entrada:** 20000, 5 | **Saída:** R$ 3400,00 |

### Exercício 14: Classificação de Triângulos

**Objetivo:** Elaborar pseudocódigo e fluxograma. Lê três lados ($a, b, c$) e ESCREVE a classificação (Equilátero, Isósceles, Escaleno) ou "Não forma um triângulo".

| Condição | Entrada (a, b, c) | Saída Esperada |
| :--- | :--- | :--- |
| **Equilátero** | 5, 5, 5 | Triângulo Equilátero |
| **Isósceles** | 6, 6, 4 | Triângulo Isósceles |
| **Escaleno** | 3, 4, 5 | Triângulo Escaleno |
| **Não Forma** | 2, 3, 6 | Não forma um triângulo |

### Exercício 15: Média e Aprovação na Disciplina

**Objetivo:** Elaborar pseudocódigo e fluxograma. Lê 3 avaliações, 3 recuperações e frequência (em dias). ESCREVE resultado final (média arredondada) e situação (Aprovado/Reprovado).

| Regras | Nota: $\max(\text{Avaliação}, \text{Recuperação})$ | Média Final: $\text{round}(\text{Média Simples})$ | Aprovação: $\text{Média} \ge 6$ **E** $\text{Freq.} \ge 75\%$ | Reprovação: $\text{Freq.} < 75\%$ resulta em 0 |
| :--- | :--- | :--- | :--- | :--- |

| Teste | Notas (a1, a2, a3) | Rec. (r1, r2, r3) | Freq. (dias)* | Média Final | Situação |
| :--- | :--- | :--- | :--- | :--- | :--- |
| **1** | 4, 6, 5 | 7, 5, 6 | 180 | 6 | Aprovado |
| **2** | 9, 10, 8 | 0, 0, 0 | 140 | 0 | Reprovado (por Freq.) |
| **3** | 5, 4, 5 | 5, 5, 5 | 190 | 5 | Reprovado (por Nota) |

*\*Assumir que a frequência mínima de 75% corresponde a 150 dias de aula (em um total de 200 dias) para os testes.*

---

## 🔄 4. Fluxo Iterativo (Laços `ENQUANTO`/`PARA`)

### Exercício 18: Controle de Senha com Loops

**Objetivo:** Modificar o fluxograma original da senha "alfa" para incluir iteração.

1.  **18.A (Loop Contínuo):** O sistema deve operar em um loop **ENQUANTO** a senha for incorreta.
2.  **18.B (Loop com Tentativas):** O sistema deve limitar o acesso a **3 tentativas** de senha. O sistema bloqueia ao 3º erro.

### Exercício 17: Pares Decrescentes e Soma Ímpar

**Objetivo:** Elaborar pseudocódigo e fluxograma. Lê um inteiro $N$.

1.  ESCREVE todos os números **pares** $\le N$, em ordem **decrescente**, até 0.
2.  ESCREVE a **soma** de todos os números **ímpares** $\le N$.

| Teste de Mesa | Entrada (N) | Saída Esperada |
| :--- | :--- | :--- |
| **Padrão** | 10 | 10, 8, 6, 4, 2, 0, 25 |

### Exercício 19: Binário para Decimal (Avançado)

**Objetivo:** Elaborar pseudocódigo para converter binário em decimal usando loops para tamanho $N$ variável.

| Teste de Mesa (19.B) | Entrada (N, Bits...) | Saída Esperada |
| :--- | :--- | :--- |
| **Caso 1** | 5, 1, 0, 0, 1, 1 | 19 |
| **Caso 2** | 7, 1, 1, 1, 0, 0, 1, 0 | 114 |

### Exercício 20: Série de Lucas

**Objetivo:** Elaborar pseudocódigo e fluxograma. ESCREVE a sequência de Lucas (começa com 2, 1, 3, 4, 7...) considerando apenas os termos **menores que 200**.

---