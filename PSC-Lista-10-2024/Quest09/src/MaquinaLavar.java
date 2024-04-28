public class MaquinaLavar {

    private String marca;
    private String cor;
    private float capacidade;

    public MaquinaLavar(String marca, String cor, float capacidade) {
        this.marca = marca;
        this.cor = cor;
        this.capacidade = capacidade;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(float capacidade) {
        this.capacidade = capacidade;
    }

    public void centrifugar() {
        System.out.println("Sua maquina esta centrifugando as roupas");
    }

    public void lavar() {
        System.out.println("Sua maquina esta lavando as roupas");
    }

    public void enxugar() {
        System.out.println("Sua maquina esta enxugando as roupas");
    }

}
