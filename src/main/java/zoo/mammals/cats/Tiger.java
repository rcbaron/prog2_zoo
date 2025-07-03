package zoo.mammals.cats;

import java.util.Objects;

public class Tiger implements Cat{
    private final String name;

    public Tiger(){
        this.name = "Tiger";
    }

    public Tiger(String name){
        this.name = name;
    }

    @Override
    public String getName(){
        return name;
    }
    @Override
    public void move(){
        System.out.println("The Tiger is running");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tiger tiger = (Tiger) o;
        return Objects.equals(name, tiger.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
