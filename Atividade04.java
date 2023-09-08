import java.util.Scanner;

public class Atividade04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Coloque a primeira nota: ");
        double nota1 = scanner.nextDouble();
        
        System.out.print("Coloque a segunda nota: ");
        double nota2 = scanner.nextDouble();
        
        double pesoNota1 = 1.0;
        double pesoNota2 = 2.0;
        
        double mediaPonderada = (nota1 * pesoNota1 + nota2 * pesoNota2) / (pesoNota1 + pesoNota2);
        
        System.out.println("Média ponderada: " + mediaPonderada);
        
        scanner.close();
    }
}
