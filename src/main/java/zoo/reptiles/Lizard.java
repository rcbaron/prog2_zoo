package zoo.reptiles;

public class Lizard implements Reptile{
    @Override
    public String getName(){
        return "Lizard";
    }
    @Override
    public void move(){
        System.out.println("The Lizard is crawling");
    }
}
