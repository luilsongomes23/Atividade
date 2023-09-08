import java.util.Scanner;

public class Atividade18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Coloque a temperatura em Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = 180 * (celsius + 32) / 100;

        System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);

        scanner.close();
    }
}
