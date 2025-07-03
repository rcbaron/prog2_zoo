package zoo.mammals.cats;

import java.util.Objects;

public class Lion implements Cat {
    private final String name;

    public Lion() {
        this.name = "Lion";
    }

    public Lion(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void move() {
        System.out.println("The Lion is running");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lion lion = (Lion) o;
        return Objects.equals(name, lion.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
