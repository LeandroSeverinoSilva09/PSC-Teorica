import java.util.Scanner;

public class Quest05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] num = new int[20];
        int[] numImp = new int[20];
        int[] numPar = new int[20];
        int i, j = 0, k = 0;

        for (i = 0; i < num.length; i++) {
            System.out.println("Digite um número:");
            num[i] = scanner.nextInt();
        }

        // Verificação se é impar ou par
        for (i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) { // é par
                numPar[j] = num[i];
                j++;
            } else {
                numImp[k] = num[i];
                k++;

            }
        }

        System.out.print("Os valores digitados pelo usuário são: ");
        for (i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }

        System.out.print("\nEntre os Valores digitados pelo usuário os impares são: ");
        for (i = 0; i < j; i++) {
            System.out.print(numImp[i] + " ");
        }

        System.out.print("\nEntre os Valores digitados pelo usuário os pares são: ");
        for (i = 0; i < k; i++) {
            System.out.print(numPar[i] + " ");
        }

        scanner.close();
    }
}
