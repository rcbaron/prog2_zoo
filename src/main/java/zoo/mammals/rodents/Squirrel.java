package zoo.mammals.rodents;

import java.util.Objects;

public class Squirrel implements Rodent {
    private final String name;

    public Squirrel() {
        this.name = "Squirrel";
    }

    public Squirrel(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void move() {
        System.out.println("The Squirrel is running");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Squirrel squirrel = (Squirrel) o;
        return Objects.equals(name, squirrel.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
