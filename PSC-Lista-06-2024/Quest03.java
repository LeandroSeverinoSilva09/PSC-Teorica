import java.util.Scanner;

public class Quest03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] notas = new double[4];
        int i;
        double soma = 0, media;

        for (i = 0; i < notas.length; i++) {
            System.out.printf("Digite o valor da nota: %d\n", i);
            notas[i] = scanner.nextInt();
            soma += notas[i];
        }
        media = soma / 4;

        System.out.println("O valor da média das notas é: " + media);

        scanner.close();
    }
}
