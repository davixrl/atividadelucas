import java.util.Scanner;

public class questao19 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite seu ano de nascimento: ");
        int anoNascimento = teclado.nextInt();

        int idade = 2025 - anoNascimento;
        System.out.println("Sua idade é: " + idade);
    }
}
