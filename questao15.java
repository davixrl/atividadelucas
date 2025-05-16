import java.util.Scanner;

public class questao15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = teclado.nextInt();
        int dobro = numero * 2;
        System.out.println("O dobro é: " + dobro);
    }
}
