package state;

public interface Context {

    void setTime(int time);

    int getTime();

    void setState(State state);

    void operator();
}
