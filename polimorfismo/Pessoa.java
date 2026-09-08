public class Pessoa{
    private String nome;
    private int idade;

    Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String n){
        nome = n;

    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int i){
        idade = i;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

}