import java.util.Scanner;

public class Atividade25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Coloque a hora: ");
        int hora = scanner.nextInt();
        
        System.out.print("Coloque os minutos: ");
        int minutos = scanner.nextInt();
        
        int minutosConvertidos = converterHoraParaMinutos(hora) + minutos;
        int segundosConvertidos = converterMinutosParaSegundos(minutosConvertidos);
        
        System.out.println("A hora digitada convertida em minutos: " + converterHoraParaMinutos(hora) + " minutos");
        System.out.println("O total dos minutos: " + minutosConvertidos + " minutos");
        System.out.println("O total dos minutos convertidos em segundos: " + segundosConvertidos + " segundos");
        
        scanner.close();
    }
    
    public static int converterHoraParaMinutos(int hora) {
        return hora * 60;
    }
    
    public static int converterMinutosParaSegundos(int minutos) {
        return minutos * 60;
    }
}
