package commander;

public class ProductACommand extends Command {

    public ProductACommand(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void exec() {
        receiver.makeProductA();
    }
}
