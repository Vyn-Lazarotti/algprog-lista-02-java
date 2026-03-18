import java.util.Scanner;

public class AlgII
{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int primeiroN, segundoN, soma, sub, mult;
        System.out.println("Digite o primeiro número: ");
        primeiroN = teclado.nextInt();
        System.out.println("Digite o segundo número: ");
        segundoN = teclado.nextInt();
        soma = primeiroN + segundoN;
        sub = primeiroN - segundoN;
        mult = primeiroN * segundoN;
        System.out.println("A soma dos dois números é " + soma);
        System.out.println("A subtração dos dois números é " + sub);
        System.out.println("A multiplicação dos dois números é " + mult);

        teclado.close();
    }
}