import java.util.Scanner;

public class AtividadeDeModolarizacao03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String timeA = primeiroTime(sc);
        String timeB = segundoTime(sc);
        String[] jogadoresA = new String[5];
        String[] jogadoresB = new String[5];

        jogadoresTimeA(sc,jogadoresA);
        jogadoresTimeB(sc,jogadoresB);

        System.out.println("Nome do Time A: "+timeA);


        for (int i = 0; i < 5; i++) {

            System.out.println("O nomme do jogador do time A : " + jogadoresA[i]);

        }

        System.out.println("Nome do Time B: "+timeB);
        for (int i = 0; i < 5; i++) {

            System.out.println("O nomme do jogador do time  B : " + jogadoresB[i]);
        }
    }

    public static String primeiroTime (Scanner sc){
        System.out.println("Digite o nome do Time A: ");
        return sc.nextLine();


    }
    public static String segundoTime (Scanner sc){
        System.out.println("Digite o nome do Time B:");
        return sc.nextLine();
    }
    public static  String jogadoresTimeA(Scanner sc, String[] jogadoresA){


        for (int i = 0; i < 5; i++) {
            System.out.println("O nomme do jogador do time A : " + (i+1));
             jogadoresA[i]=sc.nextLine();
        }
        return sc.nextLine();

    }
    public static String jogadoresTimeB(Scanner sc,String[] jogadoresB){

        for (int i = 0; i < 5; i++) {
            System.out.println("Informe o nome do jogador do time B  " + (i+1));
            jogadoresB[i] = sc.next();
        }
        return sc.nextLine();
    }

}
