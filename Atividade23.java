import java.util.Scanner;

public class Atividade23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Coloque a medida do primeiro ângulo: ");
        double angulo1 = scanner.nextDouble();
        
        System.out.print("Coloque a medida do segundo ângulo: ");
        double angulo2 = scanner.nextDouble();
        
        double angulo3 = calcularTerceiroAngulo(angulo1, angulo2);
        
        if (angulo3 > 0) {
            System.out.println("A medida do terceiro ângulo é: " + angulo3 + " graus");
        } else {
            System.out.println("Os ângulos fornecidos não formam um triângulo válido.");
        }
        
        scanner.close();
    }
    
    public static double calcularTerceiroAngulo(double angulo1, double angulo2) {
        double angulo3 = 180 - angulo1 - angulo2;
        if (angulo3 > 0) {
            return angulo3;
        } else {
            return -1; // Ângulos fornecidos não formam um triângulo válido
        }
    }
}
