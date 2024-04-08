import java.util.Scanner;

public class Quest02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] vetor = new double[10];
        int i;

        for (i = 0; i < vetor.length; i++) {
            System.out.printf("Digite o valor da posição: %d\n", i);
            vetor[i] = scanner.nextDouble();
        }
        for (i = 9; i >= 0; i--) {
            System.out.printf("O valor da posição %d do vetor é %.2f.\n", i, vetor[i]);
        }

        scanner.close();
    }
}
