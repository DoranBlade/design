package observer;

public class App {

    public static void main(String[] args) {
        // 一对多的情况
        Observer observer1 = new ProgramerObserver();
        Observer observer2 = new ManagerObserver();
        Notify notify1 = new NormarlNotify();
        Notify notify2 = new BossNotify();
        notify1.Attach(observer1);
        notify1.Attach(observer2);
        notify2.Attach(observer1);
        notify2.Attach(observer2);
        notify1.Notify();
        notify2.Notify();
    }
}
