import java.util.Scanner;

public class Quest04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] letra = new char[10];
        int i, cons = 0;

        for (i = 0; i < letra.length; i++) {
            System.out.println("Digite a primeira letra:");
            letra[i] = scanner.next().charAt(0);
            letra[i] = Character.toLowerCase(letra[i]); // se a letra for maiuscula ou minúscula vai ser sempre
                                                        // minuscula
            if (letra[i] != 'a' && letra[i] != 'e' && letra[i] != 'i' && letra[i] != 'o' && letra[i] != 'u') {
                cons += cons;
            }
        }
        System.out.printf("Foram Digitadas %d consoantes.\n", cons);
        for (i = 0; i < letra.length; i++) {
            if (letra[i] != 'a' && letra[i] != 'e' && letra[i] != 'i' && letra[i] != 'o' && letra[i] != 'u') {
                System.out.println(letra[i]);
            }
        }

        scanner.close();
    }
}
