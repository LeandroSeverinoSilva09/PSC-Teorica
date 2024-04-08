import java.util.Scanner;

public class Quest02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nota50 = 50, nota20 = 20, nota10 = 10, nota5 = 5, nota2 = 2, nota1 = 1;
        int vlrCompra, vlrPago, troco;
        int quantidadeNota50, quantidadeNota20, quantidadeNota10, quantidadeNota5, quantidadeNota2, quantidadeNota1;

        System.out.print("Digite o valor da compra: R$ ");
        vlrCompra = scanner.nextInt();

        System.out.print("Digite o valor pago: R$ ");
        vlrPago = scanner.nextInt();

        if (vlrPago < vlrCompra) {
            System.out.println("Quantia paga insuficiente para realizar a compra.");
        } else {
            // Cálculo do troco
            troco = vlrPago - vlrCompra;
            System.out.println("Troco a ser dado: R$ " + troco);

            // Cálculo do menor número de notas para o troco
            System.out.println("Notas a serem entregues como troco:");
            quantidadeNota50 = troco / nota50;
            if (quantidadeNota50 > 0) {
                System.out.println("Nota de R$ " + nota50 + ": " + quantidadeNota50);
                troco -= quantidadeNota50 * nota50;
            }
            quantidadeNota20 = troco / nota20;
            if (quantidadeNota20 > 0) {
                System.out.println("Nota de R$ " + nota20 + ": " + quantidadeNota20);
                troco -= quantidadeNota20 * nota20;
            }
            quantidadeNota10 = troco / nota10;
            if (quantidadeNota10 > 0) {
                System.out.println("Nota de R$ " + nota10 + ": " + quantidadeNota10);
                troco -= quantidadeNota10 * nota10;
            }
            quantidadeNota5 = troco / nota5;
            if (quantidadeNota5 > 0) {
                System.out.println("Nota de R$ " + nota5 + ": " + quantidadeNota5);
                troco -= quantidadeNota5 * nota5;
            }
            quantidadeNota2 = troco / nota2;
            if (quantidadeNota2 > 0) {
                System.out.println("Nota de R$ " + nota2 + ": " + quantidadeNota2);
                troco -= quantidadeNota2 * nota2;
            }
            quantidadeNota1 = troco / nota1;
            if (quantidadeNota1 > 0) {
                System.out.println("Nota de R$ " + nota1 + ": " + quantidadeNota1);
                troco -= quantidadeNota1 * nota1;
            }
        }

        scanner.close();
    }
}