package face;

public class Client {

    public static void main(String[] args) {
        SubSystemFace face1 = new FullSubSystemFace(new SubSystemA(), new SubSystemB());
        SubSystemFace face2 = new SingleSubSystemFace(new SubSystemA());
        face1.groupA();
        face1.groupB();
        face2.groupA();
        face2.groupB();
    }
}
