import java.util.Scanner;

public class AlgI
{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero;
		System.out.println("Digite um número: ");
		numero = teclado.nextInt();
		System.out.println("O número informado foi " + numero);
		
		teclado.close();
	}
}