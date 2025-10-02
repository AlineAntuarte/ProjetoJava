import java.util.Scanner;

public class TrêsExercícios {
    public static void main(String[] args) {

        // Objeto para ler informações do teclado
        Scanner teclado = new Scanner(System.in);

        /* EXERCÍCIO 1 */

        /* Introdução
         * 
         * Abaixo temos variáveis, int = número inteiro, double = número decimal e String = letras, palavras, etc.
         * Quando colocamos --> Variável = alguma coisa   estamos declarando ela, nesse caso, não igualamos a 0, mas deixamos o usuário inserir o valor
         * por meio do Scanner.
         * 'teclado.nextInt/Double/Line'
         */
        int numInteiro = teclado.nextInt();
        double numDecimal = teclado.nextDouble();
        String variavelNome  = teclado.nextLine();

        //Após abrir o chamado para teclado, deve fecha-lo
        teclado.close();
    }
}