package zoo;

import java.util.LinkedHashSet;
import java.util.Set;

public class Zoo<T extends Habitat<?>> {
    private final Set<T> habitats = new LinkedHashSet<>();

    public void build(T habitat) {
        habitats.add(habitat);
    }

    public void abandon(T habitat) {
        habitats.remove(habitat);
    }

    public void visitAllHabitats() {
        for (T habitat : habitats) {
            System.out.println("Gehege: " + habitat.getName());
        }
        System.out.println();
    }
}
