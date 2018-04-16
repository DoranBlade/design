package responsibility;

public class AfterHandler extends Handler {

    @Override
    public void handler(int req) {
        if (req < 18) {
            System.out.println("after handler");
        } else if(successor != null) {
            successor.handler(req);
        }
    }
}
