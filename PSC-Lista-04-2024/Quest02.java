import java.util.Scanner;
public class Quest02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome, senha;
        System.out.println("Digite seu nome de usuário:");
        nome = scanner.next();
        System.out.println("Digite sua senha:");
        senha = scanner.next();

        while (senha.equalsIgnoreCase(nome)) {
            System.out.println("Erro ao salvar sua senha. Sua senha não pode ser igual ao seu nome de usuário, favor digitar uma nova senha.");
            senha = scanner.next();
            
        }

        System.out.printf("Seja bem vindo %s !!", nome);


        

        scanner.close();
    }
}
