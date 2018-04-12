package proxy;

public class Client {

    public void show() {
        System.out.println("client show");
    }

    // 添加新功能,需要修改本身的类
    public void newShow() {
        System.out.println("client new show");
        show();
    }
}
