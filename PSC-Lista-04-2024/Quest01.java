import java.util.Scanner;
public class Quest01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = 11;
        System.out.println("Digite o número:");
        num = scanner.nextInt();
        while (num < 1 || num > 10){
            System.out.println("Número inválido, digite outro número:");
            num = scanner.nextInt();

        }
        System.out.printf("O número %d é válido.",num);




        scanner.close();
    }
}
