public class App {
    public static void main(String[] args) {
        Carro carro = new Carro("Fiat", "UNO", 2011, 13, "Prata");
        String modelo;
        System.out.println(
                "O seu carro é um " + carro.getMarca() + " " + carro.getModelo() + " do ano " + carro.getAno());
        modelo = carro.getModelo();
        carro.correr(modelo);

    }
}
