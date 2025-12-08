/** 객체와 클래스 기초 */

/* 객체는 속성과 동작으로 이루어져있다.
 * 클래스는 이러한 객체를 만드는 틀.
 *
 * 책에서는 아이언맨 슈트로 비유를 함.
 * 예를 들어 아래의 객체가 있다고 치자.
 * 객체명 : 아이언맨 슈트
 * 속성 : {이름 : ㅁㅁ, 색상 : ㅇㅇ, 비행 : ㄱㄴ}
 * 동작 : {이륙하다, 착륙하다, 미사일을 발사하다}
 *
 * 위 객체를 클래스 다이이그램으로 표현하자면 아래와 같다.
 * 클래스 : Armor
 * 필드 : {name : ㅁㅁ, color : ㅇㅇ, isFly : True}
 * 메서드 : {takeoff(), land(), launchMissile()}
 *
 * 이를 코드로 표현하면 아래와 같다.
 */

class Armor {
    String name;
    int height;
    boolean isFly;

    void takeoff() { }
    void land() { }
    // 메서드에서 return은 메서드의 실행을 중지하고, 값을 들고, 메서드를 호출한 곳으로 되돌아가라는 뜻임.
    // 메서드가 void일 경우 그냥 return;
    // void인데 return false; 처럼 반환값을 줘버리면 컴파일 에러남.
    boolean launchMissile() {
        return false;
    }
}

public class FTJB_객체와_클래스에_관한_고찰 {
    public static void main(String[] args) {
        Armor a = new Armor(); // Armor 클래스가 static이 아니기 때문에 필요
        boolean isMissile = a.launchMissile(); // = false

        System.out.print(isMissile ? "Yes" : "No"); // isMissile이 false이기 때문에 "No"
    }
}

