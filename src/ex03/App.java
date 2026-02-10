package ex03;

import ex03.lib.OuterRabbit;

// 어댑터(Adapter) 패턴
// 표준(Interface)에 맞게 변환해주는 역할
// 용도1 : 아직 만들지 않은 도구를 미리 연결하기 위해 (인터페이스가 없다면)
// 용도2 : 이미 만들어진 도구가 인터페이스가 맞지 않아서 변환해서 연결하기 위해
public class App {

    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        Mouse mouse = new Mouse();
        RabbitAdapter rabbit = new RabbitAdapter(new OuterRabbit());
        DoorMan doorMan = new DoorMan();
        doorMan.쫓아내(rabbit);
    }
}
