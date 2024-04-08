import java.util.Scanner;

public class Quest06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] media = new double[10];
        int i, j;
        float nota;
        double soma;
        int numAlun = 0;

        for (i = 0; i < media.length; i++) {
            soma = 0;
            System.out.println("Digite a nota do aluno " + i);
            for (j = 1; j <= 4; j++) {
                System.out.println("Digite a nota " + j);
                nota = scanner.nextFloat();
                soma += nota;
            }
            media[i] = soma / 4;
            System.out.printf("Fim aluno %d\n\n", i);
        }

        for (i = 0; i < media.length; i++) {
            if (media[i] >= 7) {
                numAlun++;
            }
        }
        System.out.println("O número total de alunos que foram aprovados é: " + numAlun);

        scanner.close();
    }
}
