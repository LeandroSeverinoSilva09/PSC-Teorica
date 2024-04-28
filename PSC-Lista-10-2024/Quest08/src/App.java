public class App {
    public static void main(String[] args) throws Exception {
        Chuveiro chuveiro = new Chuveiro("lorenzeti", "branco", 60.00);

        System.out.println("O seu chuveiro " + chuveiro.getMarca() + " custa " + chuveiro.getPreco());

        chuveiro.fluxoAgua();

    }
}
