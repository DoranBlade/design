package iteration;

import java.util.ArrayList;
import java.util.List;

public class PersonCollection implements Iterateable<Person> {

    private List<Person> container;

    public PersonCollection() {
        this.container = new ArrayList<>();
    }

    public void init() {
        container.add(new Person("tom"));
        container.add(new Person("jack"));
        container.add(new Person("lid"));
    }

    @Override
    public Person get(int index) {
        return container.get(index);
    }

    @Override
    public int size() {
        return container.size();
    }
}
