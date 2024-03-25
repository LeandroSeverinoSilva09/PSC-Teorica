import java.util.Scanner;
public class Quest03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String nome;
        int idade;
        float salario;
        char sexo;
        char estadoCivil;

        do{
            System.out.println("Digite seu nome:");
            nome = scanner.next();
        } while (nome.length()<=3);

        do{
            System.out.println("Digite sua idade:");
            idade = scanner.nextInt();
        } while(idade < 0 || idade > 150);

        do{
            System.out.println("Digite seu salário:");
            salario = scanner.nextFloat();
        }while (salario<=0);

        do {
            System.out.println("Digite seu sexo 'f' ou 'm':");
            sexo = scanner.next().charAt(0);
        } while (sexo != 'm' && sexo !='f');
        
        do{
            System.out.println("Digite seu estado civil: \n's' para Solteiro \n'c' para casado \n'v' para viúvo \n'd' para divorciado");
            estadoCivil = scanner.next().charAt(0);
        } while ( estadoCivil != 's' &&  estadoCivil != 'c' &&  estadoCivil != 'v' &&  estadoCivil != 'd' );
        




        scanner.close();
    }

}
