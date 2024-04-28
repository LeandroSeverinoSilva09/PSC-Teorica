public class App {
    public static void main(String[] args) {
        ArCondicionado arCondicionado = new ArCondicionado("samsung", "inverter", 12000, 16, 25);

        int temperaturaMinima;

        System.out.println(arCondicionado.getTemperaturaMinima());

        temperaturaMinima = arCondicionado.getTemperaturaMinima();

        arCondicionado.resfriar(temperaturaMinima);
    }
}
