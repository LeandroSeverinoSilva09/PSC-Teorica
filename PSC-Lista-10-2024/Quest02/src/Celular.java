public class Celular {
    private String marca;
    private String modelo;
    private int memoriaRam;
    private int armazenamento;
    private String cor;

    public Celular(String marca, String modelo, int memoriaRam, int armazenamento, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.memoriaRam = memoriaRam;
        this.armazenamento = armazenamento;
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

    public int getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public int getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(int armazenamento) {
        this.armazenamento = armazenamento;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void fazerChamada(String modelo) {
        System.out.printf("O seu %s está fazendo uma chamda\n", modelo);
    }

    public void tirarFotos(String modelo) {
        System.out.printf("O seu %s está tirando uma foto\n", modelo);
    }
}
