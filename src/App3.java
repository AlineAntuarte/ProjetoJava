import java.util.Scanner;

public class App3 {
    public static void main(String[] args) {
        Scanner usuario = new Scanner(System.in);

        // Exercícios

        /*
         * 1. Faça um programa que possui uma senha fixa e o usuário tem 3 chances para
         * acertá-la. Note-se de que se tratam de duas condições.
         */

        // System.out.println("Exercício 1");
        // String senha;

        // int c = 3;
        // System.out.println("Insira a senha. Você tem três chances.");

        // for (int i = 0; i < 3; i++) {
        // c--;
        // senha = usuario.nextLine();

        // if (!senha.equals("alfa")) {
        // System.out.println("Senha incorreta. Te restam " + c + " chance(s).");
        // System.out.println("i = " + i + " c = " + c);
        // } else {
        // System.out.println("Senha correta.");
        // break;
        // }

        // }

        // System.out.println("FIM.");

        // System.out.println("Exercício 2");
        // /*
        // * 2. Faça um programa que pergunte um número inteiro e quantos múltiplos
        // deste
        // * número deseja-se saber. Em seguida imprima o número de múltiplos do número
        // * requisitados.
        // */

        // System.out.println("Insira um número inteiro");
        // int num = usuario.nextInt();
        // System.out.println("Quantos múltiplos deste número deseja saber?");
        // int quantMult = usuario.nextInt();

        // int i = 0;
        // int x = 0;
        // int multiplo = 0;

        // while (i < quantMult) {
        // i++;

        // multiplo = num * x;
        // x++;

        // System.out.println("Um multiplo de '" + num + "' pode ser: " + multiplo);

        // }

        System.out.println("Exercício 3");
        /*
         * 3. Faça um programa que continuamente pede números inteiros e apenas para se
         * receber um número negativo na entrada.
         * Este programa deve verificar se o número é par ou impar, imprimir a
         * informação, e se o número for par deve
         * verificar se o número é múltiplos de 3, 5 ou 7.
         */

        // System.out.println("Insira um número inteiro positivo não nulo");
        // int num = usuario.nextInt();
        // while (num >= 1) {

        //     boolean valorImpPar = num % 2 == 0;
        //     boolean mult357;
        //     if (valorImpPar) {
        //         System.out.println("O número '" + num + "' é par");

        //         mult357 = num % 3 == 0;
        //         if (mult357) {
        //             System.out.println("'" + num + "' é múltiplo de '3'");
        //             System.out.println(mult357);
        //         } else {
        //             System.out.println("'" + num + "' não é múltiplo de '3'");
        //         }

        //         mult357 = num % 5 == 0;
        //         if (mult357) {
        //             System.out.println("'" + num + "' é múltiplo de '5'");
        //         } else {
        //             System.out.println("'" + num + "' não é múltiplo de '5'");
        //         }

        //         mult357 = num % 7 == 0;
        //         if (mult357) {
        //             System.out.println("'" + num + "' é múltiplo de '7'");
        //             System.out.println(mult357);

        //         } else {
        //             System.out.println("'" + num + "' não é múltiplo de '7'");
        //         }

        //     } else {
        //         System.out.println("O número '" + num + "' é impar");
        //     }

        //     num = usuario.nextInt();
        // }
        // System.out.println("Números negativos ou nulos não serão aceitos. Programa encerrado.");
        // System.out.println("Fim.");

        usuario.close();
    }

}
