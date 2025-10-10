import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Operadores lógicos: &, ||, !
        // operadores relacionais: >, <, >=, <=, ==, !=
        // Operador de atribuição: =
        // Operadores aritméticos: +, -, /, *, % (mod)

        /*
         * int a = 1;
         * int b = 2;
         * 
         * double resultado = a / (double) b;
         * 
         * System.out.println(resultado);
         * System.out.printf("%.4f \n",resultado);
         * 
         * 
         * int a = 1;
         * int b = 2;
         * 
         * a = a + 1;
         * a += 1;
         * a++;
         * a--;
         */

        // Encadeado
        System.out.println("Insira um número: ");
        int num = teclado.nextInt();

        /*
         * if (num == 1) {
         * System.out.println("Um");
         * } else if (num == 2) {
         * System.out.println("Dois");
         * } else if (num == 3) {
         * System.out.println("Três");
         * } else if (num == 4) {
         * System.out.println("Quatro");
         * } else {
         * System.out.println("O número inserido não é 1, 2, 3 e nem 4.");
         * }
         */

        switch (num) {
            case 1:
                System.out.println("Um");
                break;

            case 2:
                System.out.println("Dois");
                break;

            case 3:
                System.out.println("Três");
                break;

            case 4:
                System.out.println("Quatro");
                break;

            default:
                System.out.println("O número inserido não é 1, 2, 3 e nem 4.");
                break;
        }

        switch (num) {
            case 1 -> System.out.println("Um");
            case 2 -> System.out.println("Dois");
            case 3 -> System.out.println("Três");
            case 4 -> System.out.println("Quatro");
            default -> System.out.println("Número desconhecido");
        }

        System.out.println("Insira um número: ");
            
        String res = switch (teclado.nextInt()) {
            case 1 -> "Um";
            case 2 -> "Dois";
            case 3 -> "Três";
            case 4 -> "Quatro";
            default -> "Nenhum de 1 a 4";
        };

        teclado.close();
    }
}
