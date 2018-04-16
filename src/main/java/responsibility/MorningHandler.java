package responsibility;

public class MorningHandler extends Handler {

    @Override
    public void handler(int req) {
        if (req < 12) {
            System.out.println("morning handler");
        } else if (successor != null) {
            successor.handler(req);
        }
    }
}
