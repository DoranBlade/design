package mediation;

public class App {

    public static void main(String[] args) {
        Mediation mediation = new DefaultMediation();
        Colleague colleaguea = new ColleagueA(mediation);
        Colleague colleagueb = new ColleagueB(mediation);
        mediation.Add(colleaguea);
        mediation.Add(colleagueb);
        colleaguea.Send("hello");
        colleagueb.Send("good");
    }
}
