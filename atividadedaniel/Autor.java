public class Autor {
    String nome, nacionalidade;

    Autor(String nome, String nacionalidade){
        this.nome = nome;
        this.nacionalidade = nacionalidade;
    }
    
    @Override
    public String toString() {
        return "Nome: " + nome + ", Nacionalidade: " + nacionalidade;
    }



}
