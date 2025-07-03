package zoo;

import java.util.HashSet;
import java.util.Set;

public class Habitat<T extends Animal> {
    private final String name;
    private final Set<T> animals;

    public Habitat(String name) {
        this.name = name;
        this.animals = new HashSet<>();
    }

    public void add(T animal) {
        animals.add(animal);
    }

    public void remove(T animal) {
        animals.remove(animal);
    }

    public String getName() {
        return name;
    }

    public void listAnimals() {
        System.out.println("Tiere im Gehege \"" + name + "\":");
        for (T animal : animals) {
            System.out.println("- " + animal.getName());
        }
        System.out.println();
    }
}
