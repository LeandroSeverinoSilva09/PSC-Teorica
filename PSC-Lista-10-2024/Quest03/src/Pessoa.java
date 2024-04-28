public class Pessoa {
    private String nome;
    private int idade;
    private String cpf;
    private double altura;

    public Pessoa(String nome, int idade, String cpf, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void andar(String nome) {
        System.out.printf("%s está andando.\n", nome);
    }

    public void comer(String nome) {
        System.out.printf("%s está comendo.\n", nome);
    }

    public void nadar(String nome) {
        System.out.printf("%s está nadando.\n", nome);
    }
}
