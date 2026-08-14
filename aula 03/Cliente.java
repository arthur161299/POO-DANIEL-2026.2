public class Cliente {
    String nome, rg, cpf;
    Endereco endereco;
    Data data;
    Telefone telefone;

    Cliente(String nome, String rg, String cpf, Endereco endereco, Data data, Telefone telefone){
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.endereco = endereco;
        this.data = data;
        this.telefone = telefone;
    }

}
