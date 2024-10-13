import java.util.Scanner;

public class AtividadeDeModalizacao05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[4];

        entradaNome(sc, nomes);

        System.out.println("Os Nomes foram: ");
        for( int i = 0; i < nomes.length; i++){
            System.out.println("Posição"+(i+1)+"= "+nomes[i]);
        }


    }

    public static void entradaNome(Scanner sc, String[] nomes) {

        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Digite seu Nome: ");
            nomes[i] = sc.nextLine();
        }


    }
}