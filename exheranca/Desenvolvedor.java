package exheranca;

public class Desenvolvedor extends Funcionario {
    private String linguagemPrincipal;

    public Desenvolvedor(String linguagemPrincipal, String nome, String cpf, double salario){
        super(nome, cpf, salario);
        this.linguagemPrincipal = linguagemPrincipal;

    }

    public String getLiguagemPrincipal(){
        return linguagemPrincipal;
    }

    public void setLinguagemPrincipal(String ling){
        linguagemPrincipal = ling;
    }

    @Override
    public String toString() {
    return "Nome: " + super.getNome() +
           ", Linguagem Principal " + getLiguagemPrincipal();
           
    }
    
}
