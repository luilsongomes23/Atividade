import java.util.Scanner;

public class Atividade07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Coloque o peso da pessoa: ");
        double peso = scanner.nextDouble();
        
        double aumentoPeso = 0.15;
        double emagrecimentoPeso = 0.20; 
        
        double novoPesoAumento = peso * (1 + aumentoPeso);
        double novoPesoEmagrecimento = peso * (1 - emagrecimentoPeso);
        
        System.out.println("Peso com aumento de 15%: " + novoPesoAumento);
        System.out.println("Peso com emagrecimento de 20%: " + novoPesoEmagrecimento);
        
        scanner.close();
    }
}
