package state;

public class App {

    public static void main(String[] args) {
        Context context = new CurrentContext();
        context.operator();
        context.setTime(13);
        context.operator();
        context.setTime(21);
        context.operator();
    }
}
