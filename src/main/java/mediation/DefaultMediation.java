package mediation;

public class DefaultMediation extends Mediation {

    @Override
    public void Add(Colleague colleague) {
        colleagues.add(colleague);
    }

    @Override
    public void Remove(Colleague colleague) {
        colleagues.remove(colleague);
    }

    @Override
    public void Notify(String message, Colleague colleague) {
        for (Colleague item : colleagues) {
            if (item != colleague) {
                item.Notify(message);
            }
        }
    }
}
