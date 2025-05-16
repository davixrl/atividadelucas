import java.util.Scanner;

public class questao13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = teclado.nextLine();
        System.out.println("Olá, " + nome + "!");
    }
}
