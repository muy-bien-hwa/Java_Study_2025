/** 클래스, 메서드 안에서의 변수의 범위 */

class Car1 { // public X, public class 는 한 .java 파일에 하나만
    int speed;   // ✅ 멤버 변수 (객체가 살아있는 동안 유지)

    public void speedUp(int value) {
        speed = value;
    }

    public int getSpeed() {
        return speed;
    }
}

class Car2 {
    public void speedUp(int value) {
        int speed = value; // 이렇게 정의하면 이 변수는 이 메서드 안에서만 사용 가능
    }
    /* public int getSpeed() {
     *      return speed;     // 이러면 오류
     * }
     */
}

public class ChatGPT_메서드와_파라미터에_대해 { // public class의 이름은 파일명과 똑같아야 함
    public static void main(String[] args) {
        Car1 c1 = new Car1();
        c1.speedUp(30);
        System.out.println("speed : " + c1.getSpeed());
    }
}