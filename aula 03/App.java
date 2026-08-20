public class App{
    // public static void main(String[] args){
       
        
        Endereco endereco = new Endereco("Rua Motocolombó", "Nº 987", "Afogados", "Recife", "PE");
        Telefone telefone = new Telefone("081", "98759-0129");
        Data data= new Data(14,8,2026);
        Cliente cliente = new Cliente("Edmundo","10.985.352", "122.955.374-66", endereco,data,telefone);

        System.out.println(cliente.cpf);
        System.out.println(cliente.data);
        System.out.println(cliente.endereco.Logradouro);
        System.out.println(cliente.endereco.bairro);
        System.out.println(cliente.endereco.cidade);
        System.out.println(cliente.endereco.estado);
        System.out.println(cliente.endereco.numero);
        System.out.println(cliente.nome);
        System.out.println(cliente.rg);
        System.out.println(cliente. telefone);
}
}