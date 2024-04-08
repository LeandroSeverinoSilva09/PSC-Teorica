import java.util.Scanner;

public class Quest07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] num = new int[5];
        int i;
        int soma = 0, multi = 1;

        for (i = 0; i < num.length; i++) {
            System.out.println("Digite o número: ");
            num[i] = scanner.nextInt();
            soma += num[i];
            multi *= num[i];
        }

        System.out.print("Os números Digitados pelo usuário foram: ");

        for (i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println("\nA soma dos números digitados pelo usuário foi: " + soma);
        System.out.println("A multiplicação dos números Digitados pelo usuário foi: " + multi);

        scanner.close();
    }
}
