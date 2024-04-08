import java.util.Scanner;

public class Quest06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1, num2;
        int menor, maior;
        int numAleatorio;
        
        System.out.print("Digite o primeiro número inteiro: ");
        num1 = scanner.nextInt();
        System.out.print("Digite o segundo número inteiro: ");
        num2 = scanner.nextInt();

        if (num1 < num2) {
            menor = num1;
            maior = num2;
        } else {
            menor = num2;
            maior = num1;
        }

        numAleatorio = (int) (Math.random() * (maior - menor + 1)) + menor;

        if (numAleatorio % 2 == 0) {
            System.out.println("O número gerado é " + numAleatorio + " e ele é par.");
        } else {
            System.out.println("O número gerado é " + numAleatorio + " e ele é ímpar.");
        }

        scanner.close();
    }
}