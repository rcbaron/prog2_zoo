package zoo.reptiles;

import java.util.Objects;

public class Lizard implements Reptile{
    private final String name;

    public Lizard() {
        this.name = "Lizard";
    }

    public Lizard(String name) {
        this.name = name;
    }

    @Override
    public String getName(){
        return name;
    }
    @Override
    public void move(){
        System.out.println("The Lizard is crawling");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lizard lizard = (Lizard) o;
        return Objects.equals(name, lizard.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
