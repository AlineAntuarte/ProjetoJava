import java.util.Scanner;

public class App3 {
    public static void main(String[] args) {
        Scanner usuario = new Scanner(System.in);

        // Exercícios

        /*
         * 1. Faça um programa que possui uma senha fixa e o usuário tem 3 chances para
         * acertá-la. Note-se de que se tratam de duas condições.
         */

        System.out.println("Exercício 1");
        String senha;

        int c = 3;
        System.out.println("Insira a senha. Você tem três chances.");
        senha = usuario.nextLine();

        if (senha.equals("alfa")) {
            System.out.println("Senha correta.");
        } else {
            for (int i = 0; i < 3; i++) {
                c--;
                System.out.println("Senha incorreta. Te restam " + c + " chance(s).");
                System.out.println("i = " + i + "   c = " + c);
            }
        }

        System.out.println("Chances esgotadas.");

        System.out.println("Exercício 2");
        /*
         * 2. Faça um programa que pergunte um número inteiro e quantos múltiplos deste
         * número deseja-se saber. Em seguida imprima o número de múltiplos do número
         * requisitados.
         */

        System.out.println("Exercício 3");
        /*
         * 3. Faça um programa que continuamente pede números inteiros e apenas para se
         * receber um número negativo na entrada. Este programa deve verificar se o
         * número é par ou impar, imprimir a informação, e se o número for par deve
         * verificar se o número é múltiplos de 3, 5 ou 7.
         */
        usuario.close();
    }

}
