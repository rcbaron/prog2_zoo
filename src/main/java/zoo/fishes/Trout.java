package zoo.fishes;

import java.util.Objects;

public class Trout implements Fish{
    private final String name;

    public Trout(){
        this.name = "Trout";
    }

    public Trout(String name){
        this.name = name;
    }

    @Override
    public String getName(){
        return name;
    }
    @Override
    public void move(){
        System.out.println("The Salmon is swimming");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trout trout = (Trout) o;
        return Objects.equals(name, trout.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
