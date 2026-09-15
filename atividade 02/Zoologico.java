import java.util.ArrayList;

public class Zoologico {
    ArrayList<Animal> animais = new ArrayList<>();

    public boolean adicionarAnimal(Animal animal){
        for(Animal a : animais){
            if(a.getId() == animal.getId()){
                return false;
            }
        }

        animais.add(animal);
        return true;


    }
    
    public ArrayList<Animal> listarAnimais() {
    return animais;
    }

    public Animal buscarAnimais(long id){
        for(Animal a : animais){
            if(a.getId()== id){
                return a;
            }
        }
        return null;

    }
    public boolean removerAnimais(long id){
        Animal animal =buscarAnimais(id);
        if(animal != null){
            animais.remove(animal);
            return true;
        }
        return false;

    }
}
