import java.util.Scanner;
public class Quest03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valorA, valorB, valorC, delta;
        double raiz, raiz1, raiz2;

        System.out.println("Digite o valor de A:");
        valorA = scanner.nextDouble();

        System.out.println("Digite o valor de B:");
        valorB = scanner.nextDouble();

        System.out.println("Digite o valor de C:");
        valorC = scanner.nextDouble();

        if (valorA == 0 && valorB == 0 && valorC != 0 ){
            System.out.println("Coeficientes informados incorretamente.");
        }
        else if (valorA == 0 && valorB != 0) {
            System.out.println("Essa é uma equação de primeiro grau.");
            raiz = -valorC / valorB;
            System.out.println("A raiz real da equação é: " + raiz);
        } else {
            delta = valorB * valorB - 4 *valorA * valorC;

            if (delta < 0) {
                System.out.println("Esta equação não possui raízes reais.");
            } else if (delta == 0) {
                raiz = -valorB / (2 * valorA);
                System.out.println("Esta equação possui duas raízes reais iguais.");
                System.out.println("As raízes da equação são: " + raiz + " e " + raiz);
            } else {
                raiz1 = (-valorB + Math.sqrt(delta)) / (2 * valorA);
                raiz2 = (-valorB - Math.sqrt(delta)) / (2 * valorA);
                System.out.println("Esta equação possui duas raízes reais diferentes.");
                System.out.println("As raízes da equação são: " + raiz1 + " e " + raiz2);
            }
        }



        scanner.close();
    }
}
