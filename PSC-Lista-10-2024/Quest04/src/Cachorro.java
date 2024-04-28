public class Cachorro {
    private String raca;
    private int peso;
    private int idade;
    private String pelagem;

    public Cachorro(String raca, int peso, int idade, String pelagem) {
        this.raca = raca;
        this.peso = peso;
        this.idade = idade;
        this.pelagem = pelagem;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getPelagem() {
        return pelagem;
    }

    public void setPelagem(String pelagem) {
        this.pelagem = pelagem;
    }

    public void comer(int peso) {
        System.out.printf(
                "O seu cachorro está com fome e tem %dKG certifique-se de dar a quantidade correta de ração\n", peso);
    }

    public void latir(String raca) {
        System.out.printf("O seu cachorro da raça %s está latindo\n", raca);
    }

    public void correr(String raca) {
        System.out.printf("O seu cachorro da raça %s está correndo\n", raca);
    }

}
