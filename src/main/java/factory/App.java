package factory;

public class App {

    public static void main(String[] args) {
        AnimalFactory factory1 = new DogFactory();
        AnimalFactory factory2 = new CatFactory();
        Animal animal1 = factory1.create();
        Animal animal2 = factory2.create();
        animal1.run();
        animal2.run();
    }
}
