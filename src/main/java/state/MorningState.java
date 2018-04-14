package state;

public class MorningState implements State {

    @Override
    public void handler(Context context) {
        if (context.getTime() < 12) {
            System.out.println("state is morning, start study");
        } else {
            context.setState(new AfternoonState());
            context.operator();
        }
    }
}
