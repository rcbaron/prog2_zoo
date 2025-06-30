package zoo.reptiles;

public class Snake implements Reptile{
    @Override
    public String getName(){
        return "Snake";
    }
    @Override
    public void move(){
        System.out.println("The Snake is crawling");
    }
}
