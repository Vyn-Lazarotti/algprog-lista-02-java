import java.util.Scanner;

public class AlgV {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double alemanha, portugal, italia, eurotrip;
        int turistas;
        System.out.println("Digite o valor da viagem para a Alemanha: ");
        alemanha = teclado.nextDouble();
        System.out.println("Digite o valor da viagem para Portugal: ");
        portugal = teclado.nextDouble();
        System.out.println("Digite o valor da viagem para a Itália: ");
        italia = teclado.nextDouble();
        System.out.println("Digite o total de pessoas: ");
        turistas = teclado.nextInt();
        eurotrip = alemanha + portugal + italia;
        System.out.println("O valor total da viagem é de R$ " + eurotrip * turistas);
        
        teclado.close();
    }
}
