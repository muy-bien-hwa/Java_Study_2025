    /* 명령형 매개변수란?
     * public static void main(String[] args) 에서 args가 명령행 매개변수임
     * args란 String 타입의 배열 주소를 가지는 변수.
     * 
     * cmd에서, .java 파일을 실행하면서 전달하는 문자열들이 저장된 배열의 주솟값을 가짐
     * ex) C:\> java Test apple banana lemon 명령 시
     * apple banana lemon 문자열을 요소로 가지는 String 타입의 배열이 생성되고,
     * 이 배열의 시작 주소가 main() 함수의 명령행 매개변수 args에 저장됨.
     * 그래서 for(int i = 0; i < args.length; i++) {
     *  System.out.println(args[i]); } 로 위 문자열 출력 가능.
     *
     *  사실 잘 모르겠음 걍 뭔소린지 이해 못함
     *
     *
     *
     * public static void main(String[] args) 에 대해 좀 더 알아보자면,
     *
     * public static void main(String[] args) 자체가 하나의 블록임.
     * = JVM이 공식적으로 찾는 main()의 형태임.
     *
     * public = JVM이 어디서든 이 매서드를 실행할 수 있도록 공개함.
     * 반대로 private 하면, 같은 클래스 안에서만 접근 가능
     * 하나의 .java 파일에 클래스 여러 개 있어도 되지만, public 클래스는 딱 하나여야 함.
     * 또한 파일 이름은 public 클래스의 이름과 똑같아야 함.
     *
     *
     * static = (붙이거나, 안붙이거나) 객체 없이 바로 실행 가능
     * 즉, static 없는 매서드('인스턴스 매서드' 라고 함)
     */
class Test {
    void hello() {  // hello 라는 함수(X) 매서드(O)
        System.out.println("hello");
    }
}

public class FTJB_명령행_매개변수 {
    public static void main(String[] args) {
        // Test.hello(); 하면 실행 안됨. hello가 있는 class가 static이 아니기 때문에 객체부터 만들어야 함
        Test t = new Test(); // Test = 클래스(객체 타입), new Test() = Test 클래스 기반으로 만들어진 객체, t = 그 객체를 가리키는 변수명
        // 위 코드 쉽게 말하면 "Test 클래스를 이용해서 Test 객체를 생성했고, 그 객체를 t 라고 부른다."
        t.hello();
        // 이렇게 객체를 만들어 줘야 실행 가능
    }
}


     /* void = return 값이 없음
     * 반대로 int ABC() {...}, String ABC() {...}, int[] ABC() {...} 와 같이 return 값을 지정할 수 있음
     * [객체 이름] ABC() {...} 로 할 시 객체를 return함
     *
     *
     * main() = 프로그램을 실행하면 가장 먼저 실행되는 함수
     *
     */

    // JVM이란? : Java Virtual Machine, 자바 프로그램을 실행해 주는 가상 컴퓨터 느낌
    // 쉽게 말해, 자바 코드 = 게임 CD / JVM = 게임기

    /* 많이 헷갈리는 부분. Test t = new Test(); 해석
     * Test 라는 타입의 새 객체를 만들어 그 참조를 t 라는 변수에 저장하겠다.
     * 왜 객체를 만드냐? -> Test 라는 클래스가 static이 아니기 때문
     *
     * 만약 Test 클래스 안의 hello 라는 매서드가 static 이라면?
     * -> 그냥 바로 Test.hello() 로 접근 가능!!
     *
     * int 타입 = "정수 값만 들어올 수 있다."
     * Test 타입 = "Test 클래스로 만든 객체만 들어올 수 있다."
     */
