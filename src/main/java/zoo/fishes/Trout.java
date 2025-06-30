package zoo.fishes;

public class Trout implements Fish{
    @Override
    public String getName(){
        return "Trout";
    }
    @Override
    public void move(){
        System.out.println("The Trout is swimming");
    }
}
