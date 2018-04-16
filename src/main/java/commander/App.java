package commander;

public class App {

    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command command1 = new ProductACommand(receiver);
        Command command2 = new ProductBCommand(receiver);
        Invoker invoker = new Invoker();
        invoker.addCommand(command1);
        invoker.addCommand(command2);
        invoker.addCommand(command2);
        invoker.cancel(command2);
        invoker.Notify();
    }
}
