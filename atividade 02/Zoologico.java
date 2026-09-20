import java.util.ArrayList;

public class Zoologico {

    private ArrayList<Animal> animais = new ArrayList<>();

    public boolean adicionarAnimal(Animal animal) {

        for (Animal a : animais) {

            if (a.getId() == animal.getId()) {
                return false;
            }
        }

        animais.add(animal);
        return true;
    }

    public ArrayList<Animal> listarAnimais() {
        return animais;
    }

    public Animal buscarAnimal(long id) {

        for (Animal a : animais) {

            if (a.getId() == id) {
                return a;
            }
        }

        return null;
    }

    public boolean removerAnimal(long id) {

        Animal animal = buscarAnimal(id);

        if (animal != null) {
            animais.remove(animal);
            return true;
        }

        return false;
    }
}