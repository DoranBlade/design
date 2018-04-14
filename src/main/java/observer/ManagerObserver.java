package observer;

public class ManagerObserver implements Observer {

    @Override
    public void update(String msg) {
        System.out.println("manager observer update by " + msg);
    }

}
