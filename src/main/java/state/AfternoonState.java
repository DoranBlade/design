package state;

public class AfternoonState implements State {

    @Override
    public void handler(Context context) {
        if (context.getTime() < 18) {
            System.out.println("state is afternoon, start work");
        } else {
            context.setState(new EveningState());
            context.operator();
        }
    }
}
