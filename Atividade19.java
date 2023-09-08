import java.util.Scanner;

public class Atividade19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Coloque a largura do cômodo: ");
        double largura = scanner.nextDouble();

        System.out.print("Coloque o comprimento do cômodo: ");
        double comprimento = scanner.nextDouble();

        double area = largura * comprimento;
        double potencia = area * 18;

        System.out.println("A área do cômodo é: " + area + " m²");
        System.out.println("A potência de iluminação necessária é: " + potencia + " W");

        scanner.close();
    }
}
