public class Calculadora {

    private String modelo;
    private String marca;
    private String cor;
    private String tela;
    private int num1;
    private int num2;

    public Calculadora(String modelo, String marca, String cor, String tela) {
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
        this.tela = tela;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setTela(String tela) {
        this.tela = tela;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getCor() {
        return cor;
    }

    public String getTela() {
        return tela;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int somar(int num1, int num2) {
        return num1 + num2;
    }

    public int subtrair(int num1, int num2) {
        return num1 - num2;
    }

    public int multiplicar(int num1, int num2) {
        return num1 * num2;
    }

    public int dividir(int num1, int num2) {
        return num1 / num2;
    }

}
