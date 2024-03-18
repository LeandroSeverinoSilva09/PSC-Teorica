import java.util.Scanner;
public class Quest04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int codOperacao;
        double raio, perimetroCirculo, areaCirculo, volumeEsfera ;
        double pi=3.141592;

        System.out.print("Digite o código da operação (1, 2 ou 3): ");
        codOperacao = scanner.nextInt();

        System.out.print("Digite o raio do círculo ou da esfera: ");
        raio = scanner.nextDouble();

        switch (codOperacao) {
            case 1:
                perimetroCirculo = 2 * pi * raio;
                System.out.println("O perímetro do círculo é: " + perimetroCirculo);
                break;
            case 2:
                areaCirculo = pi * Math.pow(raio, 2);
                System.out.println("A área do círculo é: " + areaCirculo);
                break;
            case 3:
                volumeEsfera = (4.0 / 3.0) * pi * Math.pow(raio, 3);
                System.out.println("O volume da esfera é: " + volumeEsfera);
                break;
            default:
                System.out.println("Erro: Código de operação inválido.");
                break;
        }

        scanner.close();
    }
}