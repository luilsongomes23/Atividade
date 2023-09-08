import java.util.Scanner;

public class Atividade24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Coloque a quantidade de dinheiro em reais: ");
        double quantidadeReais = scanner.nextDouble();
        
        double valorDolar = quantidadeReais / 1.80;
        double valorMarcoAlemao = quantidadeReais / 2.00;
        double valorLibraEsterlina = quantidadeReais / 3.57;
        
        System.out.println("Valor convertido para dólares: US$" + valorDolar);
        System.out.println("Valor convertido para marco alemão: DEM" + valorMarcoAlemao);
        System.out.println("Valor convertido para libra esterlina: £" + valorLibraEsterlina);
        
        scanner.close();
    }
}
