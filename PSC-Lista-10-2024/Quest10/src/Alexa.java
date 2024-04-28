public class Alexa {

    private String cor;
    private String modelo;
    private String fabricante;
    private int ano;

    public Alexa(String cor, String modelo, String fabricante, int ano) {
        this.cor = cor;
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void falar(String modelo) {
        System.out.printf("Olá eu sou a %s, como posso te ajudar?\n", modelo);
    }

    public void escutar(String modelo) {
        System.out.printf("%s, está te escutando.\n", modelo);
    }

    public void reproduzir(String modelo) {
        System.out.printf("%s, começando a reproduz sua playlist favoritos.\n", modelo);
    }

}
