package state;

public class EveningState implements State {

    @Override
    public void handler(Context context) {
        if (context.getTime() < 24) {
            System.out.println("state is evening, start fun");
        } else {
            System.out.println("state is night, start sleep");
        }
    }
}
