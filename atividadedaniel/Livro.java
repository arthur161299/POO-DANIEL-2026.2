public class Livro{
    String nome;
    int anoPublicacao;
    Autor autor;

    Livro(String nome, int anoPublicacao, Autor autor){
        this.nome = nome;
        this.anoPublicacao = anoPublicacao;
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Livro: " + nome + ", Ano: " + anoPublicacao + ", Autor: " + autor;
    }

}