package memento;

public class App {

    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setState("state");
        Caretaker caretaker = new Caretaker();
        caretaker.setMememto(originator.createMemento());
        originator.setState("change");
        // back
        originator.setMememto(caretaker.getMememto());
    }
}
