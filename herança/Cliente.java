public class Cliente {
    
    private String nome;
    private int idade;

    public Cliente(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String n){
        nome = n;

    }
    
    public int getIdade() {
        return idade;
    }

    public void setIdade(int i){
        idade = i;

    } 
    // --- toString ---
   // @Override
   // public String toString() {
   //     return "idade: " + getIdade() +
   //             "nome: " + getNome(); }

    @Override
    public String toString() {
    return "Nome: " + getNome() +
           ", Idade: " + getIdade();
}            
    
}
