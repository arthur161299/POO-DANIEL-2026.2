public class Passaro extends Animal {
    
    Passaro(long id, String nome, int idade, double peso){
        super(id, nome, idade, peso);

        getHabilidades().add("Voar");
    }

    @Override 
    public String emitirSom(){
        return "piu";
    }

}
