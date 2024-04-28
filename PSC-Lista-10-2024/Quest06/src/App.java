import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora("cientifica", "HP", "Preta", "Digital");
        Scanner scanner = new Scanner(System.in);

        int num1, num2, result;

        System.out.println("O modelo da calculadora é: " + calculadora.getModelo());
        System.out.println("Digite o número 1");
        num1 = scanner.nextInt();
        System.out.println("Digite o número 2");
        num2 = scanner.nextInt();

        result = calculadora.somar(num1, num2);
        System.out.println("O resultado da soma dos números digitados é: " + result);

        scanner.close();

    }
}
