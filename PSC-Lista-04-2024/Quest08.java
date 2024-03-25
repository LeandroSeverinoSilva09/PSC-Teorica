import java.util.Scanner;
public class Quest08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i;
        int num, soma=0, med;

        for (i=0; i<5; i++){
            System.out.println("Digite um número:");
            num = scanner.nextInt();
            soma += num;
        }
        med = soma/5;
        
        System.out.println("A média dos números digitados é: " + med);
        

        scanner.close();
    }

}
