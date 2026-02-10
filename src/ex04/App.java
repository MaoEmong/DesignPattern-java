package ex04;

// 싱글턴(Singleton) 패턴
public class App {

    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        DoorMan doorMan = DoorMan.instance;
        Mouse mouse = new Mouse();
        doorMan.쫓아내(tiger);
    }
}
