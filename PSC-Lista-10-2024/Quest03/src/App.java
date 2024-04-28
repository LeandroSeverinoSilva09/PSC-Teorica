public class App {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Leandro", 19, "010.198.686-96", 1.85);

        String nome;
        System.out.println(pessoa.getNome());
        nome = pessoa.getNome();
        pessoa.comer(nome);
    }
}
