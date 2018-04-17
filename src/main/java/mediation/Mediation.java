package mediation;

import java.util.ArrayList;
import java.util.List;

public abstract class Mediation {

    protected List<Colleague> colleagues;

    public Mediation() {
        this.colleagues = new ArrayList<>();
    }

    public abstract void Add(Colleague colleague);

    public abstract void Remove(Colleague colleague);

    public abstract void Notify(String message, Colleague colleague);

}
