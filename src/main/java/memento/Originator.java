package memento;

public class Originator {

    private String state;

    private String info;

    public Originator() {
    }

    public Mememto createMemento() {
        return new Mememto(this.state);
    }

    public void setMememto(Mememto mememto) {
        this.state = mememto.getState();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
