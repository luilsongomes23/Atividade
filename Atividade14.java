import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class Atividade14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Coloque o ano de nascimento: ");
        int anoNascimento = scanner.nextInt();
        
        System.out.print("Coloque o ano atual: ");
        int anoAtual = scanner.nextInt();
        
        LocalDate dataNascimento = LocalDate.of(anoNascimento, 1, 1);
        LocalDate dataAtual = LocalDate.of(anoAtual, 1, 1);
        
        Period periodo = Period.between(dataNascimento, dataAtual);
        
        int idadeAnos = periodo.getYears();
        int idadeMeses = periodo.getMonths();
        int idadeDias = periodo.getDays();
        
        int idadeSemanas = idadeDias / 7;
        
        System.out.println("Idade: " + idadeAnos + " anos");
        System.out.println("Idade: " + idadeMeses + " meses");
        System.out.println("Idade: " + idadeDias + " dias");
        System.out.println("Idade: " + idadeSemanas + " semanas");
        
        scanner.close();
    }
}
