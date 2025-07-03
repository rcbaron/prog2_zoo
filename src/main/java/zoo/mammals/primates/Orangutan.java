package zoo.mammals.primates;

public class Orangutan implements Primate{
    @Override
    public String getName(){
        return "Orangutan";
    }
    @Override
    public void move(){
        System.out.println("The Orangutan is running");
    }
}
