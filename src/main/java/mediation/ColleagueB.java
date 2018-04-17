package mediation;

public class ColleagueB extends Colleague {

    public ColleagueB(Mediation mediation) {
        super(mediation);
    }

    @Override
    public void Send(String message) {
        mediation.Notify(message, this);
    }

    @Override
    public void Notify(String message) {
        System.out.println(String.format("colleague b 接受消息: %s", message));
    }
}
