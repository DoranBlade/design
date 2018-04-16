package commander;

public class ProductBCommand extends Command {

    public ProductBCommand(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void exec() {
        receiver.makeProductB();
    }
}
