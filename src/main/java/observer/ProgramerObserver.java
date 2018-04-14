package observer;

public class ProgramerObserver implements Observer {

    @Override
    public void update(String msg) {
        System.out.println("programer observer update by " + msg);
    }
}
