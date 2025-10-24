import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner usuario = new Scanner(System.in);

        // Código

        // Exemplos
        // 1. Dado um vetor com 10 números reais, faça um algoritmo que percorra o vetor
        // e imprima o seu maior elemento.

        /*
         * USANDO LAÇO FOR PARA INSERIR NÚMEROS COM INDENTAÇÃO, 10 SEMPRE VAI SER O
         * MAIOR ASSIM, É UM PADRÃO.
         * double maiorNum = 0;
         * 
         * double num[] = new double[10];
         * for (int i = 0; i < 10; i++) {
         * System.out.println("i = " + i);
         * ;
         * num[i] = i+1;
         * 
         * if (num[i] > maiorNum){
         * maiorNum = num[i];
         * }
         * }
         * 
         * System.out.println("O maior número do array é: " + maiorNum);
         */

        /*
         * USANDO LAÇO FOR COM INSERÇÃO DO USUÁRIO, PODE SER QUALQUER NÚMERO, O MAIOR
         * NÃO É ÓBVIO.
         * double maiorNum = 0;
         * 
         * double num[] = new double[10];
         * for (int i = 0; i < 10; i++) {
         * System.out.println("i = " + i);
         * System.out.println("Insira um número.");
         * 
         * num[i] = usuario.nextDouble();
         * 
         * if (num[i] > maiorNum){
         * maiorNum = num[i];
         * }
         * }
         * 
         * System.out.println("O maior número do array é: " + maiorNum);
         */

        // 2. Utilizando vetor, imprimir os n primeiros termos da série de Fibonacci:
        // 1 1 2 3 5 8 ... n

        /*
         * A série de Fibonacci é uma sequência numérica em que cada termo é a soma dos
         * dois anteriores, começando com '0' e '1'. A sequência começa com
         * \(0,1,1,2,3,5,8,13,21,34,\dots \), e é encontrada na natureza em locais como
         * o miolo de um girassol e o arranjo das pétalas de uma flor. 
         */
        System.out.println("Quantos termos da série Fibonacci deseja ver?");
        int termos = usuario.nextInt();
        int Fibonacci[] = new int[termos];

        int a = 0;
        int b = 1;

        // 0 1 2

        for (int i = 0; i < termos; i++) {

            if (i == 0) {
                Fibonacci[termos] = 0;
                System.out.println("Termo " + i + " da série Fibonacci: " + Fibonacci[termos]);

            } else if (i == 1) {
                Fibonacci[termos] = 1;
                System.out.println(i + "° Termo da série Fibonacci: " + Fibonacci[termos]);

            } else {
                Fibonacci[termos] = a + b;
                System.out.println(i + "° Termo da série Fibonacci: " + Fibonacci[termos]);

                if(i % 2 != 0){
                    a = a + b;
                }else{
                    b = a + b;
                }
            }

        }

        // Exercícios
        // 1. Defina dois vetores com 5 elementos cada. Faça um algoritmo que calcule e
        // imprima a soma deles. Ou seja, a soma de cada elemento de um vetor pelo
        // elemento correspondente do outro vetor.

        // 2. Leia a nota de 38 alunos de uma turma e calcule a média das notas, a maior
        // e a menor nota.

        usuario.close();
    }
}