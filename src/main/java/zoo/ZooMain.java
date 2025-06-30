package zoo;

import zoo.mammals.cats.Cat;
import zoo.mammals.cats.Lion;
import zoo.mammals.cats.Tiger;
import zoo.mammals.primates.Chimpanzee;
import zoo.mammals.primates.Orangutan;
import zoo.mammals.primates.Primate;

public class ZooMain {
    public static void main(String[] args) {

        // Habitat for Cat's
        Habitat<Cat> catHabitat = new Habitat<>("CatHabitat");
        catHabitat.add(new Lion());
        catHabitat.add(new Tiger());
        catHabitat.add(new Lion());
        catHabitat.listAnimals();

        //Habitat for Primates
        Habitat<Primate> primateHabitat = new Habitat<>("PrimateHabitat");
        primateHabitat.add(new Chimpanzee());
        primateHabitat.add(new Orangutan());
        primateHabitat.add(new Chimpanzee());
        primateHabitat.listAnimals();


    }
}
