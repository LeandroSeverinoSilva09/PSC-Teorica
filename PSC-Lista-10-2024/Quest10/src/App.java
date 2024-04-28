public class App {
    public static void main(String[] args) {
        Alexa alexa = new Alexa("Azul", "echo dot 5", "Amazon", 2023);

        String modelo;

        System.out.println("O modelo da sua Alexa é: " + alexa.getModelo());
        modelo = alexa.getModelo();
        alexa.escutar(modelo);

    }
}
