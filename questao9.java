class Aluno {
    String nome;
    int idade;
}

public class questao9 {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.nome = "Maria";
        aluno1.idade = 15;
        
        System.out.println("Nome: " + aluno1.nome);
        System.out.println("Idade: " + aluno1.idade);
    }
}