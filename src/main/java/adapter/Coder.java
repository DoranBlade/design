package adapter;

public class Coder implements Person {

    @Override
    public void study() {
        System.out.println("coder study online");
    }

    @Override
    public void work() {
        System.out.println("coder work on computer");
    }
}
