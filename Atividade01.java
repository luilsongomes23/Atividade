import java.util.Scanner;

public class Atividade01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Coloque o primeiro número: ");
        double Numero1 = scanner.nextDouble();
        
        System.out.print("Coloque o segundo número: ");
        double Numero2 = scanner.nextDouble();
        
        double Valor = Numero1 - Numero2;
        
        System.out.println("A subtração de " + Numero1 + " - " + Numero2 + " é: " + Valor);
        
        scanner.close();
    }
}
