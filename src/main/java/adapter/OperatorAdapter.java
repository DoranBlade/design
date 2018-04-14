package adapter;

public class OperatorAdapter implements Operator {

    private Person person;

    public OperatorAdapter(Person person) {
        this.person = person;
    }

    @Override
    public void reade() {
        person.study();
    }

    @Override
    public void write() {
        person.work();
    }
}
