import java.util.Scanner;

public class questao17 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        double nota1 = teclado.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double nota2 = teclado.nextDouble();

        double media = (nota1 + nota2) / 2;
        System.out.println("A média é: " + media);
    }
}
