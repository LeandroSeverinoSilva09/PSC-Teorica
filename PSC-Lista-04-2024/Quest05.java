import java.util.Scanner;
public class Quest05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double popA;
        double taxaA;
        double popB;
        double taxaB;
        char continuar = 'c';

        do{
            System.out.println("Digite o número da populalção do pais A:");
            popA = scanner.nextDouble();
            System.out.println("Digite o número da taxas de crescimento inicial do pais A em %:");
            taxaA = scanner.nextDouble();

            System.out.println("Digite o número da populalção B:");
            popB = scanner.nextDouble();
            System.out.println("Digite o número da taxas de crescimento inicial do pais B em %:");
            taxaB = scanner.nextDouble();

            int anos = 0;
            taxaA = taxaA/100;
            taxaB = taxaB/100;

            
            while (popA < popB) {
                popA = popA + (popA * taxaA);
                popB = popB + (popB * taxaB);
                anos ++;
            }

            System.out.println("O número de anos necessários para que a população do país A ultrapasse ou iguale a população do país B é de: " + anos + "\n");

            System.out.println("Digite 'c' para continuar e 's' para sair:");
            continuar = scanner.next().charAt(0);

        } while (continuar =='c');


        scanner.close();
    }

}
