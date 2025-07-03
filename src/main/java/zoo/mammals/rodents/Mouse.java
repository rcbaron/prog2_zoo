package zoo.mammals.rodents;

import java.util.Objects;

public class Mouse implements Rodent {
    private final String name;

    public Mouse() {
        this.name = "Mouse";
    }

    public Mouse(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void move() {
        System.out.println("The Mouse is running");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mouse mouse = (Mouse) o;
        return Objects.equals(name, mouse.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
