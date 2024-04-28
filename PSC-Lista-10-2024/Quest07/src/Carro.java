public class Carro {

    private String marca;
    private String modelo;
    private int ano;
    private int aro;
    private String cor;

    public Carro(String marca, String modelo, int ano, int aro, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.aro = aro;
        this.cor = cor;
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

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getAro() {
        return aro;
    }

    public void setAro(int aro) {
        this.aro = aro;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void correr(String modelo) {
        System.out.printf("Seu %s esta correndo.\n", modelo);
    }

    public void partida(String modelo) {
        System.out.printf("Seu %s esta dando partida.\n", modelo);
    }

    public void desligar(String modelo) {
        System.out.printf("Seu %s esta desligando.\n", modelo);
    }

    public void barulho(String modelo) {
        System.out.printf("Seu %s esta fazendo barulho.\n", modelo);
    }

}
