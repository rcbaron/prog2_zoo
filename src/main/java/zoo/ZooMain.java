package zoo;

import zoo.fishes.Fish;
import zoo.fishes.Salmon;
import zoo.fishes.Trout;
import zoo.mammals.cats.Cat;
import zoo.mammals.cats.Lion;
import zoo.mammals.cats.Tiger;
import zoo.mammals.primates.Chimpanzee;
import zoo.mammals.primates.Orangutan;
import zoo.mammals.primates.Primate;
import zoo.mammals.rodents.Mouse;

public class ZooMain {
    public static void main(String[] args) {

        // Habitat for Cat's
        Habitat<Cat> catHabitat = new Habitat<>("CatHabitat");
        catHabitat.add(new Lion());
        catHabitat.add(new Tiger());
        catHabitat.add(new Lion());
        catHabitat.listAnimals();

        // Habitat for Primates
        Habitat<Primate> primateHabitat = new Habitat<>("PrimateHabitat");
        primateHabitat.add(new Chimpanzee());
        primateHabitat.add(new Orangutan());
        primateHabitat.add(new Chimpanzee());
        primateHabitat.listAnimals();

        // Habitat for Fishes
        Habitat<Fish> fishHabitat = new Habitat<>("FishHabitat");
        fishHabitat.add(new Salmon());
        fishHabitat.add(new Trout());
        fishHabitat.add(new Salmon());
        fishHabitat.add(new Salmon("Red Salmon"));
        fishHabitat.listAnimals();

        // Habitat for Salmons
        Habitat<Salmon> salmonHabitat = new Habitat<>("SalmonHabitat");
        salmonHabitat.add(new Salmon());
        salmonHabitat.add(new Salmon("Green Salmon"));
        salmonHabitat.add(new Salmon("Blue Salmon"));

        // Habitat for Trouts
        Habitat<Trout> troutHabitat = new Habitat<>("TroutHabitat");
        troutHabitat.add(new Trout());
        troutHabitat.add(new Trout("Red Trout"));
        troutHabitat.add(new Trout("Yellow Trout"));

        // Habitat for Mouses
        Habitat<Mouse> mouseHabitat = new Habitat<>("MouseHabitat");
        mouseHabitat.add(new Mouse());
        mouseHabitat.add(new Mouse("Mickey"));
        mouseHabitat.add(new Mouse("Pinky"));
        mouseHabitat.listAnimals();

        // Define Zoo
        Zoo<Habitat<? extends Animal>> zoo = new Zoo<>();

        // Build Habitats for Zoo
        zoo.build(mouseHabitat);
        zoo.build(primateHabitat);
        zoo.build(catHabitat);

        // Show all Habitats in Zoo
        zoo.visitAllHabitats();

        // Define Aquarium
        Aquarium fishAquarium = new Aquarium();

        // Build Habitats for Aquarium
        fishAquarium.build(fishHabitat);
        fishAquarium.build(salmonHabitat);
        fishAquarium.build(troutHabitat);

        // Show all Habitats in Aquarium
        fishAquarium.visitAllHabitats();
    }
}
