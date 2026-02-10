package ex02;

// 프록시 패턴(Proxy Pattern)
// 포워드 프록시
// 리버스 프록시
// SOLID : 객체지향원칙 (D, O)
// DIP : 추상적이 것에 의존하라
// OCP : 새로운 코드에는 OPEN, 기존 코드에는 CLOSE

public class App {

    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        DoorMan doorMan = new DoorManProxy();
        Mouse mouse = new Mouse();
        doorMan.쫓아내(tiger);
    }
}
