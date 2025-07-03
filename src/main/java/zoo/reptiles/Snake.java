package zoo.reptiles;

import java.util.Objects;

public class Snake implements Reptile{
    private final String name;

    public Snake() {
        this.name = "Snake";
    }

    public Snake(String name) {
        this.name = name;
    }

    @Override
    public String getName(){
        return name;
    }
    @Override
    public void move(){
        System.out.println("The Snake is crawling");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Snake snake = (Snake) o;
        return Objects.equals(name, snake.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
