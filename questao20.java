import java.util.Scanner;

public class questao20 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite uma mensagem: ");
        String mensagem = teclado.nextLine();

        for (int i = 0; i < 3; i++) {
            System.out.println(mensagem);
        }
    }
}
