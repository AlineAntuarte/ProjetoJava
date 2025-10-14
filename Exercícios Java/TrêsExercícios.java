import java.util.Scanner; //Abrindo chamado para futuro uso do Scanner

public class TrêsExercícios {
    public static void main(String[] args) {

        // --- >> Objeto para ler informações do teclado << ---
        Scanner teclado = new Scanner(System.in);

        /*
         * Introdução
         * 
         * Abaixo temos variáveis, int = número inteiro, double = número decimal e
         * String = letras, palavras, etc.
         * Quando colocamos --> Variável = alguma coisa <-- estamos declarando ela,
         * nesse caso, não igualamos a 0,
         * mas deixamos o usuário inserir o valor por meio do Scanner.
         * 
         * -- 'teclado.nextInt'
         * -- 'teclado.nextDouble;'
         * -- 'teclado.nextLine;'
         * 
         * 
         * int numInteiro = teclado.nextInt();
         * double numDecimal = teclado.nextDouble();
         * String variavelNome = teclado.nextLine();
         * 
         * Após abrir o chamado para teclado, deve fecha-lo
         * teclado.close();
         */

        // -----------------------------------------------------------------------------------------------------------------

        // Exercício 1

        System.out.println("Exercício 1 | Área e Volume do Paralelepípedo");

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

        // -----------------------------------------------------------------------------------------------------------------
        {
            // Exercício 2

            System.out.println("Exercício 2 | Salário hora");

            int i = 0;
            double totalEmp = 0;
            double salF = 0;
            while (i < 3) {
                System.out.println("Insira respectivamente o valor e a hora trabalhada");
                double salHora = teclado.nextDouble();
                double hora = teclado.nextDouble();

                salF = salHora * hora;
                totalEmp = totalEmp + salF;

                System.out.println("O salário do colaborador 1 é: R$" + salF);

                i = i + 1;
                System.out.println("i = " + i);
            }

            System.out.println("O total pago pela empresa aos três é: R$" + totalEmp);

        }

        // -----------------------------------------------------------------------------------------------------------------

        {

            // Exercício 3

            /*
             * Nos Estados Unidos da América, a altura de uma pessoa é medida em pés +
             * polegadas. Por exemplo, considere uma pessoa com 5 pés + 11 polegadas
             * de altura (escrito simplesmente como 5'11"); sabendo que
             * 
             * 1 pé equivale a 12 polegadas
             * 1 polegada equivale a 2.54 centímetros
             * 
             * conclui-se que tal pessoa mede 180.34 cm, ou seja, aproximadamente 1.80 m.
             * Elabore um pseudocódigo para um algoritmo que LÊ dois
             * números inteiros representando os valores da altura de uma pessoa em pés +
             * polegadas e ESCREVE o valor da altura em metros.
             * Em seguida, execute um teste de mesa com a entrada 5, 11; a saída deve ser
             * 1.8034.
             */

            System.out.println("Insira o valor da sua altura em pés");
            double pe = teclado.nextDouble();
            System.out.println("Insira o valor da sua altura em polegadas");
            double pol = teclado.nextDouble();

            double m = ((pe * 12) + (pol)) * 2.54;
            System.out.println(m / 100);

            System.out.println("Sua altura nos EUA: " + (int)pe + "'" + (int)pol + "''");
            System.out.println("Sua altura no Brasil: " + m / 100 + " metros");

        }

        // Exercício 3.1

        /*
         * Elabore outro pseudocódigo, agora para um algoritmo que LÊ um único valor em
         * metros e ESCREVE os valores em pés e polegadas correspondentes. Assuma que
         * exista uma função chamada round que arredonda um número real para o inteiro
         * mais próximo; por exemplo:
         * round(3.14) = 3
         * round(3.86) = 4
         * round(5) = 5.
         * Em seguida, execute um teste de mesa com a entrada 1.8; a saída deve ser
         * 5,11.
         */

        {

            System.out.println("Insira o valor da sua altura em metros");
            double m = teclado.nextDouble();
            double total = 0;
            double pe = 0;
            double pol = 0;

            total = m * 3.28084;
            pe = Math.floor(total);
            pol = Math.round((total - pe) * 12);

            System.out.println("Sua altura no Brasil: " + m + " metros");
            System.out.println("Sua altura nos EUA: " + (int) pe + "'" + (int) pol + "''");

            teclado.close();
        }
    }
}