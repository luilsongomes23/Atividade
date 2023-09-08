import java.util.Scanner;

public class Atividade08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Coloque o valor da base maior do trapézio: ");
        double baseMaior = scanner.nextDouble();
        
        System.out.print("Coloque o valor da base menor do trapézio: ");
        double baseMenor = scanner.nextDouble();
        
        System.out.print("Coloque o valor da altura do trapézio: ");
        double altura = scanner.nextDouble();
        
        double area = ((baseMaior + baseMenor) * altura) / 2;
        
        System.out.println("Área do trapézio: " + area);
        
        scanner.close();
    }
}
