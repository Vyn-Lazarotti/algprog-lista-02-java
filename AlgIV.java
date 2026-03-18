import java.util.Scanner;

public class AlgIV 
{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        String nomeCliente;
        int litroV;
        double litroP = 6.50, valorF;
        System.out.println("Digite o nome do(a) cliente: ");
        nomeCliente = teclado.nextLine();
        System.out.println("Quantos litros de gasolina? ");
        litroV = teclado.nextInt();
        valorF = litroV * litroP;
        System.out.println("O valor por " + nomeCliente + " é de R$ " + valorF);

        teclado.close();
    }
}
