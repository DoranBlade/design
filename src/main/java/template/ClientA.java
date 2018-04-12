package template;

public class ClientA {

    public void show() {
        System.out.println("client show");
    }

    public void call() {
        System.out.println("ClientA call");
    }

    public static void main(String[] args) {
        ClientA clientA = new ClientA();
        clientA.show();
        clientA.call();
        ClientB clientB = new ClientB();
        clientB.show();
        clientB.call();
    }

}
