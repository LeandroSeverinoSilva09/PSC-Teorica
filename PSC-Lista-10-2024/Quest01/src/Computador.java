public class Computador {
    private String cor;
    private String marca;
    private int memoriaRam;
    private int armazenamento;
    private String tipoDeArmazenamento;
    private String processador;
    private String placaDeVideo;

    public Computador(String cor, String marca, int memoriaRam, int armazenamento, String tipoDeArmazenamento,
            String processador, String placaDeVideo) {
        this.cor = cor;
        this.marca = marca;
        this.memoriaRam = memoriaRam;
        this.armazenamento = armazenamento;
        this.tipoDeArmazenamento = tipoDeArmazenamento;
        this.processador = processador;
        this.placaDeVideo = placaDeVideo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
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

    public String getTipoDeArmazenamento() {
        return tipoDeArmazenamento;
    }

    public void setTipoDeArmazenamento(String tipoDeArmazenamento) {
        this.tipoDeArmazenamento = tipoDeArmazenamento;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public String getPlacaDeVideo() {
        return placaDeVideo;
    }

    public void setPlacaDeVideo(String placaDeVideo) {
        this.placaDeVideo = placaDeVideo;
    }

    public void ligar() {
        System.out.println("O Computador está ligando");
    }

    public void armazenar(int armazenamento) {
        System.out.printf("O Computador tem %d Gb de armazenamento\n", armazenamento);
    }

    public void processar() {
        System.out.println("O Computador está processando informações");
    }

    public void desligar() {
        System.out.println("O Computador está desligando");
    }

}
