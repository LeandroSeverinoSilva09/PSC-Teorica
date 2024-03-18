import java.util.Scanner;

public class Quest05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double resultado = 0;
        char operacao;
        double num1, num2;


        System.out.print("Digite o primeiro número real: ");
        num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número real: ");
        num2 = scanner.nextDouble();

        System.out.print("Digite o símbolo de operação (+, -, *, / ou ^): ");
        operacao = scanner.next().charAt(0);

        switch (operacao) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                resultado = num1 / num2;
                break;
            case '^':
                resultado = Math.pow(num1, num2);
                break;
            default:
                System.out.println("Erro: Símbolo de operação inválido.");
        }

        System.out.println("O resultado da operação é: " + resultado);

        scanner.close();
    }
}