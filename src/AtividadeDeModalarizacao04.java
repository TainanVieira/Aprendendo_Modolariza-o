

import java.util.Scanner;

public class AtividadeDeModalarizacao04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome = indentificaN(sc);
        int idade = indentificaId(sc, nome);

    }

    public static String indentificaN(Scanner sc) {
        System.out.print("Digite seu nome: ");
        return sc.nextLine();
    }

    public static int indentificaId(Scanner sc, String nome) {
        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        if (idade < 18) {
            System.out.println(nome + ", você é menor de idade.");
        } else {
            System.out.println(nome + ", você é maior de idade.");
        }

        return idade;
    }
}
