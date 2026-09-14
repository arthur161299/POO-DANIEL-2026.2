public class Cachorro extends Animal {

    Cachorro(long id, String nome, int idade, double peso){
        super(id, nome, idade, peso);

        getHabilidades().add("farejar");
    }

    @Override
    public String emitirSom(){
        return "au";
    }
    
}
