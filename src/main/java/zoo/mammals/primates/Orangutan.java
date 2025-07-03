package zoo.mammals.primates;

import java.util.Objects;

public class Orangutan implements Primate{
    private final String name;

    public Orangutan() {
        this.name = "Orangutan";
    }

    public Orangutan(String name) {
        this.name = name;
    }

    @Override
    public String getName(){
        return name;
    }
    @Override
    public void move(){
        System.out.println("The Orangutan is running");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Orangutan orangutan = (Orangutan) o;
        return Objects.equals(name, orangutan.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
