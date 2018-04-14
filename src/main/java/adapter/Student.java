package adapter;

public class Student implements Person {

    @Override
    public void study() {
        System.out.println("student study on school");
    }

    @Override
    public void work() {
        System.out.println("student not work");
    }
}
