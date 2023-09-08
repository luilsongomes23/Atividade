import java.util.Scanner;

public class Atividade22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Coloque o número de lados do polígono: ");
        int numLados = scanner.nextInt();
        
        if (numLados < 3) {
            System.out.println("Um polígono precisa ter pelo menos 3 lados.");
        } else {
            int numDiagonais = calcularNumeroDiagonais(numLados);
            System.out.println("O número de diagonais do polígono com " + numLados + " lados é: " + numDiagonais);
        }
        
        scanner.close();
    }
    
    public static int calcularNumeroDiagonais(int numLados) {
        if (numLados < 3) {
            return 0; 
        }
        return numLados * (numLados - 3) / 2;
    }
}
