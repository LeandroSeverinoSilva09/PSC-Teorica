
public class App {
    public static void main(String[] args) {

        Computador computador = new Computador("Prata", "Acer", 8, 256, "SSD", "i5-10210U", "Nvidia mx250");

        System.out.println(computador.getArmazenamento());
        computador.armazenar(computador.getArmazenamento());

    }
}
