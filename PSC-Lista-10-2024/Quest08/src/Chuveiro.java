public class Chuveiro {

    private String marca;
    private String cor;
    private double preco;

    public Chuveiro(String marca, String cor, double preco) {
        this.marca = marca;
        this.cor = cor;
        this.preco = preco;
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

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void esquentar() {
        System.out.println("Seu chuveiro esta esquentando");
    }

    public void molhar() {
        System.out.println("Seu chuveiro esta despejando agua");
    }

    public void fluxoAgua() {
        System.out.println("Seu chuveiro esta controlando o fluxo de agua");
    }

}
