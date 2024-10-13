import java.util.Scanner;

public class AtividadeDemodolarizacao01 {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                String nome= solicitarN(sc);
                int idade= solicitarId(sc);

                motrarDados(nome, idade);

            }

            public static  String solicitarN(Scanner sc){
                System.out.println("digite su nome: ");
                return sc.nextLine();
            }

            public static int solicitarId (Scanner sc){
                System.out.println("Digite sua idade");
                return sc.nextInt();
            }


             public static void motrarDados (String nome, int idade ) {
                 System.out.println("Seu nome é " + nome + "Sua idade é " + idade);


             }
        }



