public class App {
    public static void main(String[] args) {
        Celular celular = new Celular("Samsung", "S23+", 8, 512, "grafite");

        String modelo;

        System.out.println(celular.getModelo());
        modelo = celular.getModelo();
        celular.fazerChamada(modelo);
    }
}
