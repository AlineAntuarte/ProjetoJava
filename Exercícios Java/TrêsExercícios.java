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
        // Exercício 2

        /*
         * Elabore um fluxograma para um algoritmo que LÊ os salários por hora (em R$
         * por hora) e as horas trabalhadas de três colaboradores de uma empresa e
         * ESCREVE o pagamento de cada um deles, bem como o total pago pela empresa. Não
         * utilize mais que quatro variáveis. A ordem de leitura dos dados de entrada
         * deve ser:
         * Salário do colaborador 1
         * horas trabalhadas do colaborador 1
         * salário do colaborador 2
         * horas trabalhadas do colaborador 2
         * salário do colaborador 3
         * horas trabalhadas do colaborador 3.
         * A ordem de escrita dos dados de saída deve ser:
         * Pagamento do colaborador 1
         * pagamento do colaborador 2
         * pagamento do colaborador 3
         * total pago pela empresa.
         * Em seguida, execute um teste de mesa com a entrada 50, 8, 60, 7, 50, 7.5;
         * A saída deve ser 400, 420, 375, 1195.
         */

        System.out.println("Exercício 2 | Salário hora");
        Scanner teclado = new Scanner(System.in);
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

            i = i++;
        }

        System.out.println("O total pago pela empresa aos três é: R$" + totalEmp);

        teclado.close();
    }
}