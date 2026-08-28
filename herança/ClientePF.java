public class ClientePF extends Cliente {
    private String cpf;

    public ClientePF(String nome, String cpf, int idade){
        super(nome, idade);
        this.cpf = cpf;
        

    }

    public String getCpf(){
        return cpf;
    }

    public void setCpf(String cp){
        cpf = cp;

    }
  //    @Override
  //  public String toString() {
  //      return "CPF: " + getCpf(); 
  //               }

    @Override
    public String toString() {
    return super.toString() +
           ", CPF: " + getCpf();
}
    
}
