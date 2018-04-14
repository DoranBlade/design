package single;

final class HungerSingle {

    private final static HungerSingle instance;

    static {
        instance = new HungerSingle();
    }

    static HungerSingle getInstance() {
        return instance;
    }

    void print() {
        System.out.println("hunger single instance print");
    }
}
