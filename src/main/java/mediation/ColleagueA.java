package mediation;

public class ColleagueA extends Colleague {

    public ColleagueA(Mediation mediation) {
        super(mediation);
    }

    @Override
    public void Send(String message) {
        mediation.Notify(message, this);
    }

    @Override
    public void Notify(String message) {
        System.out.println(String.format("colleague a 接受消息: %s", message));
    }
}
