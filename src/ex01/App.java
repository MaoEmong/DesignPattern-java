package ex01;

// 전략(Strategy) 패턴
// SOLID : 객체지향원칙 (D, O)
// DIP : 추상적이 것에 의존하라
// OCP : 새로운 코드에는 OPEN, 기존 코드에는 CLOSE
public class App {

    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        DoorMan doorMan = new DoorMan();
        Mouse mouse = new Mouse();
        doorMan.쫓아내(tiger);
    }
}
