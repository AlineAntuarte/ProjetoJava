import java.util.Scanner;

public class funcaoMetodo {
    // 1. O Scanner agora é estático E inicializado aqui.
    // Assim, todos os métodos estáticos (incluindo o 'main')
    // podem usá-lo sem problemas.
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        // 2. Removi o 'Scanner scanner = new Scanner(System.in);' daqui
        // para não criar uma variável duplicada.

        boolean teste = true;
        int opcao = -1;

        while (teste) {
            System.out.println("\nEscolha uma das opções:");
            System.out.println("1: Imprime de 1 a 100");
            System.out.println("2: Imprime 'n' numeros");
            System.out.println("3: Imprime 5 nomes");
            System.out.println("4: Adição");
            System.out.println("5: Imprime quantos nomes o usuario quiser");
            System.out.println("6: Imprime os 'n' primeiros numeros impares");
            System.out.println("7: Imprima a tabuada de 1 a 10");
            System.out.println("8: Calculo de X elevado a Y");
            System.out.println("9: Calcula o fatorial de um numero");
            System.out.println("10: Imprime Fibonacci | For");
            System.out.println("11: Imprime Fibonacci | While");
            System.out.println("12: Insere tamanho de array e o preenche, após isso, o imprime.");
            System.out.println("13: Unir dois arrays");
            System.out.println("14: É Palindromo?");
            System.out.println("15: É numero primo?");
            System.out.println("16: É um numero perfeito?");
            System.out.print("Opçao escolhida: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    imprime100();
                    break;

                case 2:
                    imprimeN();
                    break;

                case 3:
                    nomes5();
                    break;

                case 4:
                    adicao();
                    break;

                case 5:
                    pessoas();
                    break;

                case 6:
                    imparesN();
                    break;

                case 7:
                    tabuada();
                    break;

                case 8:
                    elevado();
                    break;

                case 9:
                    calculaFatorial();
                    break;

                case 10:
                    fibonacciFor();
                    break;

                case 11:
                    fibonacciWhile();
                    break;

                case 12:
                    criarArray();
                    break;

                case 13:
                    unirArrays();
                    break;

                case 14:
                    palindromo();
                    break;

                case 15:
                    primo();
                    break;

                case 16:
                    perfeito();
                    break;

                default:
                    teste = false;
                    break;
            }
        }

        scanner.close(); // Fecha o scanner estático no fim do programa.
    }

    public static void imprime100() {
        System.out.println("Irei imprimir de 1  a 100");
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void imprimeN() {
        System.out.println("Irei imprimir de 1 até o número escolhido");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void nomes5() {
        System.out.println("Irei imprimir 5 nomes escolhidos");
        int i = 0;
        String nomes[] = new String[5];

        while (i < 5) {
            nomes[i] = scanner.nextLine();
            i++;
        }
        
        System.out.println("Nomes recebidos, irei imprimir.");
        while (i < 5) {
            System.out.println(nomes[i]);
            i++;
        }
    }

    public static void adicao() {
    }

    public static void pessoas() {
    }

    public static void imparesN() {
    }

    public static void tabuada() {
    }

    public static void elevado() {
    }

    public static void calculaFatorial() {
    }

    public static void fibonacciFor() {
    }

    public static void fibonacciWhile() {
    }

    public static void criarArray() {
    }

    public static void unirArrays() {
    }

    public static void palindromo() {
    }

    public static void primo() {
    }

    public static void perfeito() {
    }

}