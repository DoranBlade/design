package responsibility;

public class App {

    public static void main(String[] args) {
        Handler handler1 = new MorningHandler();
        Handler handler2 = new AfterHandler();
        Handler handler3 = new EveningHandler();
        handler1.setSuccessor(handler2);
        handler2.setSuccessor(handler3);

        int[] reqs = new int[]{2, 6, 13, 17, 20, 23};
        for (int req : reqs) {
            handler1.handler(req);
        }
    }
}
