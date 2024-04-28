public class App {
    public static void main(String[] args) throws Exception {
        MaquinaLavar maquinaLavar = new MaquinaLavar("LG", "Branco", 13);

        System.out.println("Sua nova máquina de lavar é da marca " + maquinaLavar.getMarca());
        maquinaLavar.enxugar();
    }
}
