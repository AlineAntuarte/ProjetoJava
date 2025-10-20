import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        // Objeto para ler informações do teclado
        Scanner teclado = new Scanner(System.in);

        /* EXERCÍCIO DE MENU */

        System.out.println("1. Área de um retângulo");
        System.out.println("2. Área de um triângulo");
        System.out.println("3. Hipotenusa de um triângulo retângulo");
        System.out.println("4. Área de um círculo");
        System.out.println("5. Perímetro de um círculo");
        System.out.println("6. Média de 3 números de ponto flutuante");

        System.out.println("\nInsira um número do menu.\n");
        int num = teclado.nextInt();

        double area = 0;
        double base = 0;
        double altura = 0;
        double catetoA = 0;
        double catetoB = 0;
        double hipotenusa = 0;
        double raio = 0;
        double numF = 0;
        double numFF = 0;
        double numFFF = 0;
        double media = 0;

        switch (num) {
            case 1:
                System.out.println("1. Área de um retângulo");
                System.out.println("1. (base*altura)");

                System.out.println("Insira o valor da base");
                base = teclado.nextDouble();
                System.out.println("Insira o valor da altura");
                altura = teclado.nextDouble();

                if (base <= 0 || altura <= 0) {
                    System.out.println("Números nulos e/ou negativos não serão aceitos");
                    break;
                }

                area = base * altura;

                System.out.println("O valor da área é: " + area);
                break;

            case 2:
                System.out.println("2. Área de um triângulo");
                System.out.println("2. (base*altura/2)");

                System.out.println("Insira o valor da base");
                base = teclado.nextDouble();
                System.out.println("Insira o valor da altura");
                altura = teclado.nextDouble();

                if (base <= 0 || altura <= 0) {
                    System.out.println("Números nulos e/ou negativos não serão aceitos");
                    break;
                }

                area = (base * altura) / 2;

                System.out.println("O valor da área é: " + area);
                break;

            case 3:
                System.out.println("3. Hipotenusa de um triângulo retângulo");
                System.out.println("3. (h² = a² + b²)");

                System.out.println("Insira o valor do Cateto A");
                catetoA = teclado.nextDouble();
                System.out.println("Insira o valor do Cateto B");
                catetoB = teclado.nextDouble();

                if (catetoA <= 0 || catetoB <= 0) {
                    System.out.println("Números nulos e/ou negativos não serão aceitos");
                    break;
                }

                hipotenusa = (Math.pow(catetoA, 2)) + (Math.pow(catetoB, 2));

                System.out.println("O valor da hipotenusa é: " + hipotenusa);
                break;

            case 4:
                System.out.println("4. Área de um círculo");
                System.out.println("4. (pi*raio*raio)");

                System.out.println("Insira o valor do raio");

                raio = teclado.nextDouble();

                if (raio <= 0) {
                    System.out.println("Números nulos e/ou negativos não serão aceitos");
                    break;
                }

                area = Math.PI * raio * raio;

                System.out.println("O valor da área do círculo é: " + area);

                break;

            case 5:
                System.out.println("5. Perímetro de um círculo");
                System.out.println("5. (2*pi*raio)");

                System.out.println("Insira o valor do raio");

                raio = teclado.nextDouble();

                if (raio <= 0) {
                    System.out.println("Números nulos e/ou negativos não serão aceitos");
                    break;
                }

                area = 2 * Math.PI * raio;

                System.out.println("O valor da área do círculo é: " + area);
                break;

            case 6:
                System.out.println("6. Média de 3 números de ponto flutuante");
                System.out.println("6. (num_1+num_2+...+num_3)/3");

                System.out.println("Insira três números");
                numF = teclado.nextDouble();
                numFF = teclado.nextDouble();
                numFFF = teclado.nextDouble();

                if (numF <= 0 || numFF <= 0 || numFFF <= 0) {
                    System.out.println("Números nulos e/ou negativos não serão aceitos");
                    break;
                }
                
                media = (numF + numFF + numFFF) / 3;
                System.out.println("O valor da média é: " + media);
                break;

            default:
                System.out.println("Operação inválida!");
                break;
        }
        teclado.close();
    }
}