public class Gato extends Animal { 

    Gato(long id,String nome, int idade, double peso ){
        super(id, nome, idade, peso);

        getHabilidades().add("agilidade");
    }

    @Override
    public String emitirSom(){
        return "Miao";

    }
    
}
