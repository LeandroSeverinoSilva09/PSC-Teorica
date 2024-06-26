import java.util.ArrayList;
import java.util.Scanner;

public class Quest03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList<Double>();

        int qntdNota = 0;
        double nota = 0;
        double soma = 0;
        double media;
        int acimaMedia = 0;
        int abaixosete = 0;

        System.out.println("Digite as notas, para finalizar o programa digite -1");
        nota = scanner.nextDouble();
        while (nota != -1) {
            notas.add(nota);
            qntdNota++;
            nota = scanner.nextDouble();
        }
        System.out.println("Quantidade de notas digitadas " + qntdNota);

        System.out.println("Valores na ordem em que foram informados ");
        for (double valor : notas) {
            System.out.print(valor + " ");
        }
        System.out.println();

        System.out.println("Valores na ordem inversa ");
        for (int i = qntdNota - 1; i >= 0; i--) {
            System.out.println(notas.get(i));
        }
        soma = 0;
        for (double valor : notas) {
            soma += valor;
        }
        System.out.println("Soma dos valores " + soma);

        media = soma / qntdNota;
        System.out.printf("Média dos valores %.2f\n", media);

        for (double valor : notas) {
            if (valor > media) {
                acimaMedia++;
            }
        }
        System.out.println("Quantidade de valores acima da média " + acimaMedia);

        for (double valor : notas) {
            if (valor < 7) {
                abaixosete++;
            }
        }
        System.out.println("Quantidade de valores abaixo de sete " + abaixosete);

        System.out.println("Programa finalizado ");

        scanner.close();
    }
}