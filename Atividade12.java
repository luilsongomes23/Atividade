import java.util.Scanner;

public class Atividade12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Coloque o valor do salário mínimo: ");
        double salarioMinimo = scanner.nextDouble();

        System.out.print("Coloque o valor do salário do funcionário: ");
        double salarioFuncionario = scanner.nextDouble();

        double quantidadeSalariosMinimos = salarioFuncionario / salarioMinimo;

        System.out.println("O funcionário ganha aproximadamente " + quantidadeSalariosMinimos + " salários mínimos.");

        scanner.close();
    }
}
