package zoo.fishes;

import java.util.Objects;

public class Salmon implements Fish {
    private final String name;

    public Salmon() {
        this.name = "Salmon";
    }

    public Salmon(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void move() {
        System.out.println("The Salmon is swimming");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Salmon salmon = (Salmon) o;
        return Objects.equals(name, salmon.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
