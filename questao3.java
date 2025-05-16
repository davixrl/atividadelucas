import java.util.Scanner;

public class questao3 {
    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o seu nome?");
        String nome = scanner.nextLine();
        System.out.println("Ola, " + nome);
    }
}