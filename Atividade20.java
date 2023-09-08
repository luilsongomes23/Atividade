import java.util.Scanner;

public class Atividade20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Coloque a medida do ângulo: ");
        double angulo = scanner.nextDouble();

        System.out.print("Coloque a distância da parede: ");
        double distancia = scanner.nextDouble();

        double anguloRadianos = Math.toRadians(angulo);

        double comprimentoEscada = distancia / Math.sin(anguloRadianos);

        System.out.println("O comprimento da escada necessário é: " + comprimentoEscada + " metros");

        scanner.close();
    }
}
