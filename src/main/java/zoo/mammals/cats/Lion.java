package zoo.mammals.cats;

public class Lion implements Cat{
    @Override
    public String getName(){
        return "Lion";
    }
    @Override
    public void move(){
        System.out.println("The Lion is running");
    }
}
