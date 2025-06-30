package zoo.fishes;

public class Salmon implements Fish{
    @Override
    public String getName(){
        return "Salmon";
    }
    @Override
    public void move(){
        System.out.println("The Salmon is swimming");
    }
}
