package exheranca;

public class Gerente extends Funcionario {
    private String departamento;

    public Gerente(String departamento, String nome, String cpf, double salario){
        super (nome, cpf, salario);
        this.departamento = departamento;
       
    }

    public String getDepartamento(){
        return departamento;
    }

    public void setDepartamento(String depart){
        departamento = depart;
    }

    @Override
    public String toString() {
    return "Nome: " + super.getNome() +
           ", Departamento Pessoa " + getDepartamento();
           
    }
  
    
}
