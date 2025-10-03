import java.util.Scanner; //Abrindo chamado para futuro uso do Scanner

public class TrêsExercícios {
    public static void main(String[] args) {

        /*
         * Objeto para ler informações do teclado
         * Scanner teclado = new Scanner(System.in);
         * 
         * 
         * Introdução
         * 
         * Abaixo temos variáveis, int = número inteiro, double = número decimal e
         * String = letras, palavras, etc.
         * Quando colocamos --> Variável = alguma coisa <-- estamos declarando ela,
         * nesse caso, não igualamos a 0,
         * mas deixamos o usuário inserir o valor por meio do Scanner.
         * 
         * -- 'teclado.nextInt/Double/Line'
         * 
         * int numInteiro = teclado.nextInt();
         * double numDecimal = teclado.nextDouble();
         * String variavelNome = teclado.nextLine();
         * 
         * Após abrir o chamado para teclado, deve fecha-lo
         * teclado.close();
         */

        // Exercício 1
        System.out.println("Exercício 1 | Área e Volume do Paralelepípedo");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira respectivamente comprimento, largura e altura");

        double comp = teclado.nextDouble();
        double larg = teclado.nextDouble();
        double alt = teclado.nextDouble();

        double area = 0;
        double vol = 0;

        area = (alt * larg + alt * comp + comp * larg) * 2;
        vol = comp * larg * alt;

        System.out.println("O valor da área é: " + area);
        System.out.println("O valor do volume é: " + vol);

        System.out.println("Insira respectivamente quantidade de caixas e custo do m²");

        double quant = teclado.nextDouble();
        double custo = teclado.nextDouble();

        double custoTotal = 0;

        custoTotal = area * custo * quant;

        System.out.println("O custo total é de R$" + custoTotal);

        teclado.close();
    }

    {
        // Exercício 1
        System.out.println("Exercício 2 | Salário hora");
        Scanner teclado = new Scanner(System.in);
        int i = 0;
        while (i < 3) {
            System.out.println("Insira respectivamente o valor e a hora trabalhada");
            double valor = teclado.nextDouble();
            double hora = teclado.nextDouble();

            i = i++;
        }

        teclado.close();
    }
}