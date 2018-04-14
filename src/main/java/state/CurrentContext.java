package state;

public class CurrentContext implements Context {

    private int time;
    private State state;

    public CurrentContext() {
        time = 0;
        state = new MorningState();
    }

    @Override
    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public int getTime() {
        return time;
    }

    @Override
    public void setState(State state) {
        this.state = state;
    }

    @Override
    public void operator() {
        this.state.handler(this);
    }
}
