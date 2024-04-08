import java.util.Scanner;

public class Quest01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[5];
        int i;

        for (i = 0; i < vetor.length; i++) {
            System.out.printf("Digite o valor da posição: %d\n", i);
            vetor[i] = scanner.nextInt();
        }
        for (i = 0; i < vetor.length; i++) {
            System.out.printf("O valor da posição %d do vetor é %d.\n", i, vetor[i]);
        }

        scanner.close();
    }
}
