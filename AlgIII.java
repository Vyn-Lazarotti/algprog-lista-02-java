import java.util.Scanner;

public class AlgIII 
{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        double primeiraNota, segundaNota, terceiraNota, quartaNota, media;
        System.out.println("Digite a primeira nota bimestral: ");
        primeiraNota = teclado.nextDouble();
        System.out.println("Digite a segunda nota bimestral: ");
        segundaNota = teclado.nextDouble();
        System.out.println("Digite a terceira nota bimestral: ");
        terceiraNota = teclado.nextDouble();
        System.out.println("Digite a quarta nota bimestral: ");
        quartaNota = teclado.nextDouble();
        media = (primeiraNota + segundaNota + terceiraNota + quartaNota) / 4;
        System.out.println("Média final: " + media);

        teclado.close();
    }
}
