import java.util.Scanner;

public class App {
	public static void main(String[] args) {
	// EXERCÍCIO UMMMMMMMMMMMMMMMM
	System.out.println("Olá, mundo!!!");
    
	// Objeto para ler informações do teclado
	Scanner teclado = new Scanner(System.in);

	System.out.println("Entre com o seu nome: ");
	String nome = teclado.nextLine();
    
	// Algo para ler do teclado

	System.out.println("Entre com o seu ano de nascimento: ");
	int anoNas = teclado.nextInt();
	System.out.println("Entre com o ano atual: ");
	int anoAtual = teclado.nextInt();

    int idade = anoAtual - anoNas;

	if (anoAtual > anoNas){
        System.out.println("O ano atual não pode ser menor que o ano de nascimento");
 	}else{
        System.out.println("Olá " + nome + ", você tem " + idade + " anos!");
        System.out.println("Você será atendido!");
    }

    teclado.close(); // liberando o recurso

	}


}
