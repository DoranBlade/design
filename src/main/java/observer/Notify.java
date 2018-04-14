package observer;

public interface Notify {

    void Attach(Observer in);

    void Detach(Observer in);

    void Notify();

    String status();
}
