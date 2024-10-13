import java.util.Scanner;

public class AtividadeDemodolarizacao02 {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
        int num1 =primeiroN(sc);
        int num2 =segundoN(sc);

        somaDosValores(num1, num2 );
    }
    public static int primeiroN (Scanner sc){
        System.out.println("Digite o Primeiro numero: ");
        return sc.nextInt();
    }
    public static int segundoN (Scanner sc){
        System.out.println("Digite o Segundo Numero: ");
        return sc.nextInt();
    }
    public static void  somaDosValores(int num1, int num2){
        int soma = num1 + num2;
       System.out.println("A soma de " + num1 + " e " + num2 + " é: " + soma);

    }

}
