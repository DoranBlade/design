package simpleFactory;

import org.junit.Test;

public class AnimalFactoryTest {

    @Test
    public void create() {
        Animal animal = AnimalFactory.create("cat");
        animal.run();
    }
}