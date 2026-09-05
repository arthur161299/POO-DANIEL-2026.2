package exheranca;

public class Funcionario {
    private String nome, cpf;
    private double salario;

    public Funcionario(String nome, String cpf, double salario ){
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public String getNome(){
        return  nome; 
    }

    public void setNome(String c){
        nome = c;
    }

    public String getCpf(){ 
        return cpf;  
    }

    public void setCpf(String cp){
        cpf = cp;
    }

    public double getSalario(){
        return salario;
    }

    public void setSalario(double sal){
        salario = sal;
    }

    @Override
    public String toString() {
    return "Nome: " + getNome() +
           ", Cpf: " + getCpf() +
           ", Salario: " + getSalario();
    }
}
