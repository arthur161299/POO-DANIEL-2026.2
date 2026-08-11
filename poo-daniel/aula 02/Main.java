public class Main {
    public static void main(String[] args){
        Pessoa p = new Pessoa();
        p.cpf = "12345678910";
        p.idade = 18;
        p.nome = "ola";
        p.distancia = 20;
        
        p.andar();
        System.err.println(" andou");
    }
    


}
