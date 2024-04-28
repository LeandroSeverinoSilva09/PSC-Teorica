public class ArCondicionado {

    private String marca;
    private String modelo;
    private int potencia;
    private int temperaturaMinima;
    private int temperaturaMaxima;

    public ArCondicionado(String marca, String modelo, int potencia, int temperaturaMinima, int temperaturaMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = potencia;
        this.temperaturaMinima = temperaturaMinima;
        this.temperaturaMaxima = temperaturaMaxima;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getTemperaturaMinima() {
        return temperaturaMinima;
    }

    public void setTemperaturaMinima(int temperaturaMinima) {
        this.temperaturaMinima = temperaturaMinima;
    }

    public int getTemperaturaMaxima() {
        return temperaturaMaxima;
    }

    public void setTemperaturaMaxima(int temperaturaMaxima) {
        this.temperaturaMaxima = temperaturaMaxima;
    }

    public void resfriar(int temperaturaMinima) {
        System.out.printf("Começando a resfriar o ambiente a %d Graus.\n", temperaturaMinima);
    }

    public void esquentar(int temperaturaMaxima) {
        System.out.printf("Começando a esquentar o ambiente a %d Graus.\n", temperaturaMinima);
    }

    public void ventilar() {
        System.out.println("O modo ventilar está ativado");
    }

}
