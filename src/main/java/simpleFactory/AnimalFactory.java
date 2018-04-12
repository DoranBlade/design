package simpleFactory;

/**
 * 简单工厂模式
 */
public class AnimalFactory {

    public static Animal create(String type) {
        switch (type) {
            case "dog":
                return new Dog();
            case "cat":
                return new Cat();
        }
        return null;
    }
}
