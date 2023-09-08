import java.util.Scanner;

public class Atividade03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Coloque o primeiro número: ");
        double numero1 = scanner.nextDouble();
        
        System.out.print("Coloque o segundo número (não pode ser zero): ");
        double numero2 = scanner.nextDouble();
        
        // Verifica se o segundo número é zero
        if (numero2 == 0) {
            System.out.println("O segundo número não pode ser zero.");
        } else {
            double resultado = numero1 / numero2;
            System.out.println("Resultado da divisão: " + resultado);
        }
        
        scanner.close();
    }
}
