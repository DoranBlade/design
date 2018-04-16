package responsibility;

public class EveningHandler extends Handler {

    @Override
    public void handler(int req) {
        if (req < 24) {
            System.out.println("evening handler");
        } else if(successor != null) {
            successor.handler(req);
        }
    }
}
