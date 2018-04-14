package face;

public class FullSubSystemFace implements SubSystemFace {

    private SubSystemA systemA;
    private SubSystemB systemB;

    public FullSubSystemFace(SubSystemA systemA, SubSystemB systemB) {
        this.systemA = systemA;
        this.systemB = systemB;
    }

    @Override
    public void groupA() {
        systemA.m1();
        systemB.m3();
    }

    @Override
    public void groupB() {
        systemA.m2();
        systemB.m4();
    }
}
