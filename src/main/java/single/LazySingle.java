package single;

class LazySingle {

    private static LazySingle instance;
    private static final Object lock = new Object();

    static LazySingle getInstance() {
        if (instance == null) {
            synchronized (lock) {
                if (instance == null) {
                    instance = new LazySingle();
                }
            }
        }
        return instance;
    }

    void print() {
        System.out.println("lazy single print");
    }
}
