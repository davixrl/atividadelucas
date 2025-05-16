class Calculadora {
    public int somar(int a, int b) {
        return a + b;
    }
}

public class questao10 {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
            int resultado = calc.somar(3, 4);
            System.out.println("A soma é: " + resultado);
    }
}