import java.util.Scanner;

public class Atividade17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do raio da esfera: ");
        double raio = scanner.nextDouble();

        double pi = Math.PI;

        // Cálculo do comprimento da esfera
        double comprimento = 2 * pi * raio;
        System.out.println("O comprimento da esfera é: " + comprimento);

        // Cálculo da área da esfera
        double area = pi * raio * raio;
        System.out.println("A área da esfera é: " + area);

        // Cálculo do volume da esfera
        double volume = (4.0 / 3.0) * pi * Math.pow(raio, 3);
        System.out.println("O volume da esfera é: " + volume);

        scanner.close();
    }
}
