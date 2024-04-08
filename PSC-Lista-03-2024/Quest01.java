import java.util.Scanner;
public class Quest01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1, n2, n3, menor=0, maior=0;

        System.out.println("Digite o primeiro número:");
        n1 = scanner.nextInt();

        System.out.println("Digite o segundo número:");
        n2 = scanner.nextInt();

        System.out.println("Digite o terceiro número:");
        n3 = scanner.nextInt();
        
        if (n1>n2){
            if (n1>n3){
                maior = n1;
            }
            if (n2>n3){
                menor = n3;
            }
            else{
                menor = n2;
            }
        }
        if (n2>n1){
            if (n2>n3){
                maior = n2;
            }
            else{
                menor = n1;
            }
        }
        if (n3>n1){
            if (n3>n2){
                maior = n3;
            }
            else{
                menor = n1;
            }

        }
        
        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);


        scanner.close();
    }

}
