import java.util.Scanner;
public class Quest07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maior=0;
        int num=0;
        int i;

        for (i=1; i<=5; i++){
            System.out.println("Digite o número:");
    
            num = scanner.nextInt();

            if (num > maior){
                maior = num;
            }


        }
        System.out.println("O maior número é: " + maior);


        

        scanner.close();
    }

}
