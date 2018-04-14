package face;

public class SingleSubSystemFace implements SubSystemFace {

    private SubSystemA subSystemA;

    public SingleSubSystemFace(SubSystemA subSystemA) {
        this.subSystemA = subSystemA;
    }

    @Override
    public void groupA() {
        subSystemA.m1();
    }

    @Override
    public void groupB() {
        subSystemA.m2();
    }
}
