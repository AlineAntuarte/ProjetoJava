import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner usuario = new Scanner(System.in);

        // Como fazer um Vetor?
        // int/double/string Array[] = new int/double/string[tamanho do array];

        // Como Inserir um valor em um Vetor?
        // int/double/string Array[indice do array] = usuario.nextInt(); Para inserção
        // do usuário
        // int/double/string Array[indice do array] = x; Para inserção fixa pré-definida

        // Como chamar o valor dentro de um array?
        // Array[indice do array], a partir daqui, faça o que bem entender com o valor
        // guardado dentro daquele indice especifico que citou.

        // Código

        // Exemplos
        // 1. Dado um vetor com 10 números reais, faça um algoritmo que percorra o vetor
        // e imprima o seu maior elemento.

        // USANDO LAÇO FOR PARA INSERIR NÚMEROS COM INDENTAÇÃO, 10 SEMPRE VAI SER O
        // MAIOR ASSIM, É UM PADRÃO.
        System.out.println("----------------------------");
        System.out.println("Exercício de Exemplo - 1");
        System.out.println("----------------------------");

        double maiorNum = 0;

        double num[] = new double[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
            ;
            num[i] = i + 1;

            if (num[i] > maiorNum) {
                maiorNum = num[i];
            }
        }

        System.out.println("O maior número do array é: " + maiorNum);

        // USANDO LAÇO FOR COM INSERÇÃO DO USUÁRIO, PODE SER QUALQUER NÚMERO, O MAIOR
        // NÃO É ÓBVIO.
        double maiorNum2 = 0;

        double num2[] = new double[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
            System.out.println("Insira um número.");

            num2[i] = usuario.nextDouble();

            if (num2[i] > maiorNum2) {
                maiorNum2 = num2[i];
            }
        }

        System.out.println("O maior número do array é: " + maiorNum2);

        System.out.println("----------------------------");
        System.out.println("Exercício de Exemplo - 2");
        System.out.println("----------------------------");

        // 2. Utilizando vetor, imprimir os n primeiros termos da série de Fibonacci:
        // 1 1 2 3 5 8 ... n

        // A série de Fibonacci é uma sequência numérica em que cada termo é a soma dos
        // dois anteriores, começando com '0' e '1'. A sequência começa com
        // \(0,1,1,2,3,5,8,13,21,34,\dots \), e é encontrada na natureza em locais como
        // o miolo de um girassol e o arranjo das pétalas de uma flor. 

        System.out.println("Quantos termos da série Fibonacci deseja ver?");
        int termos = usuario.nextInt();
        int Fibonacci[] = new int[termos];

        int a = 0;
        int b = 1;

        for (int i = 0; i < termos; i++) {

            if (i == 0) {
                Fibonacci[i] = a;
                System.out.println("Termo " + i + " da série Fibonacci: " + Fibonacci[i]);

            } else if (i == 1) {
                Fibonacci[i] = b;
                System.out.println(i + "° Termo da série Fibonacci: " + Fibonacci[i]);

            } else {
                Fibonacci[i] = a + b;
                System.out.println(i + "° Termo da série Fibonacci: " + Fibonacci[i]);

                if (i % 2 != 0) {
                    System.out.println("Impar");
                    b = a + b;
                } else {
                    System.out.println("Par");
                    a = a + b;
                }
            }

        }

        System.out.println("----------------------------");
        System.out.println("Exercício - 1");
        System.out.println("----------------------------");

        // Exercícios
        // 1. Defina dois vetores com 5 elementos cada. Faça um algoritmo que calcule e
        // imprima a soma deles. Ou seja, a soma de cada elemento de um vetor pelo
        // elemento correspondente do outro vetor.

        System.out.println("Soma dos valores de seus respectivos indices | Array - Vetor");

        double caixaUm[] = new double[5];
        double caixaDois[] = new double[5];
        double somaCaixas = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Insira o valor do indice '" + i + "' da Caixa 1");
            caixaUm[i] = usuario.nextDouble();
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Insira o valor do indice '" + i + "' da Caixa 2");
            caixaDois[i] = usuario.nextDouble();
        }

        for (int i = 0; i < 5; i++) {

            somaCaixas = caixaUm[i] + caixaDois[i];
            System.out.println("A soma dos valores de indice '" + i + "' são: " +
                    somaCaixas);
        }

        System.out.println("----------------------------");
        System.out.println("Exercício - 2");
        System.out.println("----------------------------");

        // 2. Leia a nota de 38 alunos de uma turma e calcule a média das notas, a maior
        // e a menor nota.

        System.out.println("Notas dos alunos, média, maior e menor nota");

        double Notas[] = { 5.91, 10, 0.45, 8.2, 1, 3.7, 9.0, 2, 7.14, 0, 5.5, 9.8, 4, 1.2, 6.33, 10, 3, 7.8, 0.05, 5,
                8.9, 1.5, 9, 2.6, 6.0, 0.1, 7, 4.3, 10, 1.99, 8, 3.1, 6, 9.4, 0.7, 2, 5.2, 4.8 };

        double media = 0;
        double maiorNota = 0;
        double menorNota = 11;
        int aluno = 1;

        for (int i = 0; i < 38; i++) {
            System.out.println("A nota do aluno '" + aluno + "' é: " + Notas[i]);
            aluno++;

            if (Notas[i] > maiorNota) {
                maiorNota = Notas[i];
            } else {

            }

            if (Notas[i] < menorNota) {
                menorNota = Notas[i];
            } else {

            }
            media = media + Notas[i];
        }
        media = media / 38;

        System.out.println("A maior nota é: " + maiorNota);
        System.out.println("A menor nota é: " + menorNota);
        System.out.println("A nota média de 38 alunos é: " + media);

        usuario.close();
    }
}