package single;

public class App {

    public static void main(String[] args) {
        HungerSingle hungerSingle = HungerSingle.getInstance();
        hungerSingle.print();
        LazySingle lazySingle = new LazySingle();
        lazySingle.print();
    }
}
