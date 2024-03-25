import java.util.Scanner;
public class Quest10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1, num2;
        int i;

        System.out.println("Digite o primeiro número: ");
        num1 = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        num2 = scanner.nextInt();

        System.out.println("\n");
        
        for (i=num1; i<=num2; i++){
            System.out.print(i + " ");
        }
        
        

        scanner.close();
    }

}
