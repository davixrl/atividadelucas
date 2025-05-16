import java.util.Scanner;

public class questao11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite seu nome completo: ");
        String nome = teclado.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = teclado.nextInt();
        teclado.nextLine();

        System.out.print("Digite sua turma: ");
        String turma = teclado.nextLine();
        
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Turma: " + turma);
    }
}

