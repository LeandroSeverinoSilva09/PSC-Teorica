import java.util.Scanner;
public class Quest06 {
    public static String conversao(int hrs, int min){
        char formato;
        if (hrs > 12){
            hrs-=12;
            formato = 'P';
        }
        else if (hrs==12) {
            formato = 'P';
        }
        else{
            formato = 'A';
        }
        return String.format("%02d:%02d %s", hrs, min, formato); 
    }
    public static void result(String horaFinal){
        System.out.println("A hora convertida é: " + horaFinal);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int hora, minutos, sair;

        do{
            System.out.println("Digite as horas:");
            hora = scanner.nextInt();
            System.out.println("Digite os minutos:");
            minutos = scanner.nextInt();

            result(conversao(hora, minutos));

            System.out.println("Digite 0 para sair ou 1 para continuar");
            sair = scanner.nextInt();
        }while(sair != 0 );
        scanner.close();
    }

}
