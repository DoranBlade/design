package mediation;

public abstract class Colleague {

    protected Mediation mediation;

    public Colleague(Mediation mediation) {
        this.mediation = mediation;
    }

    public abstract void Send(String message);

    public abstract void Notify(String message);

}
