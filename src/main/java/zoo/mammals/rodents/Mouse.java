package zoo.mammals.rodents;

public class Mouse implements Rodent{
    @Override
    public String getName(){
        return "Mouse";
    }
    @Override
    public void move(){
        System.out.println("The Mouse is running");
    }
}
