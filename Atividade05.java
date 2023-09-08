import java.util.Scanner;

public class Atividade05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("COloque o preço do produto: ");
        double precoOriginal = scanner.nextDouble();
        
        double desconto = 0.25;
        
        double novoPreco = precoOriginal - (precoOriginal * desconto);
        
        System.out.println("Preço com desconto: " + novoPreco);
        
        scanner.close();
    }
}
