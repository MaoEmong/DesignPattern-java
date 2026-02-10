package ex04;

public class DoorMan {

    // 이 코드는 단 한번만 실행된다
    public static DoorMan instance = new DoorMan();

    private DoorMan(){}

    // 책임
    public void 쫓아내(Animal a){
        System.out.println(a.getName()+" 저리가");
    }
}
