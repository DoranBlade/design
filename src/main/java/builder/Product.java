package builder;

import java.util.ArrayList;
import java.util.List;

public class Product {

    private List<String> list;

    public Product() {
        list = new ArrayList<>();
    }

    public void add(String item) {
        this.list.add(item);
    }

    public void show() {
        System.out.println(list);
    }

}
