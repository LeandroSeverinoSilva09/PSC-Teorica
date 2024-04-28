public class App {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("bulldog", 15, 1, "fina");

        int peso;

        System.out.println(cachorro.getPeso());
        peso = cachorro.getPeso();
        cachorro.comer(peso);

    }
}
