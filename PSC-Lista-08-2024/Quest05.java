import java.util.Scanner;
public class Quest05 {
    public static double somaImposto(int taxaImposto, double custo){
        custo = custo + (custo * taxaImposto/100);
        return custo;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int taxa;
        double produto, valorFinal;
        
        System.out.println("Digite o valor do produto:");
        produto = scanner.nextDouble();
        System.out.println("Digigte a taxa do imposto:");
        taxa = scanner.nextInt();

        valorFinal = somaImposto(taxa, produto);
        System.out.println("O valor do produto é: " + valorFinal);


        scanner.close();
    }

}
