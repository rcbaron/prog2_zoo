package zoo.mammals.primates;

import java.util.Objects;

public class Chimpanzee implements Primate {
    private final String name;

    public Chimpanzee() {
        this.name = "Chimpanzee";
    }

    public Chimpanzee(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void move() {
        System.out.println("The Chimpanzee is running");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Chimpanzee that = (Chimpanzee) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
