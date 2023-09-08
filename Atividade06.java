import java.util.Scanner;

public class Atividade06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o salário fixo do funcionário: ");
        double salarioFixo = scanner.nextDouble();
        
        System.out.print("Digite o valor das vendas do funcionário: ");
        double vendas = scanner.nextDouble();
        
        double taxaComissao = 0.04; // 4% de comissão
        
        double comissao = vendas * taxaComissao;
        
        double salarioFinal = salarioFixo + comissao;
        
        System.out.println("Comissão: " + comissao);
        System.out.println("Salário final: " + salarioFinal);
        
        scanner.close();
    }
}
