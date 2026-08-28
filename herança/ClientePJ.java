public class ClientePJ extends Cliente {
    private String cnpj;

    public ClientePJ(String nome, int idade, String cnpj){
        super(nome, idade);
        this.cnpj = cnpj;

    }

    public String getCnpj(){
        return cnpj;
    }
    
    public void setCnpj(String cn){
        cnpj = cn;
    }

    // --- toString ---
    //@Override
    //public String toString() {
    //    return "CNPJ; " + getCnpj(); }

    @Override
    public String toString() {
    return super.toString() +
           ", CNPJ: " + getCnpj();
}
}
