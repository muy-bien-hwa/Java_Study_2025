/** 정적 멤버 중 정적 메서드(클래스 메서드) */

// static 메서드는 객체 없이 실행되므로
// main()의 지역 변수나 인스턴스 필드에 직접 접근할 수 없음
// 반대로 static 멤버는 객체 없이도 접근 가능

// 실행 순서 : static 먼저 -> main() -> 인스턴스들
// 정확히 말하면,
// 1. 클래스 로딩
// 2. static 필드 초기화 & static 초기화 블록 실행
// 3. main() 실행
// 4. new로 객체 생성될 때 인스턴스 필드 초기화 & 생성자 실행

public class FTJB_staticMethod {
    int num = 123;  // 인스턴스 필드임. 클래스 필드이려면 static 사용. 왜 인스턴스 필드냐?
    // FTJB_staticMethod a = new FTJB_staticMethod();
    // FTJB_staticMethod b = new FTJB_staticMethod();
    // a.num = 100;
    // b.num = 200;
    // 이런 식으로 인스턴스 마다 따로 접근 가능하기 때문에.

    public static void main(String[] args) {
        FTJB_staticMethod.print1(); // 가능
        // print1(); 이렇게 써도 되지만 헷갈리기 때문에

        // FTJB_staticMethod.print2(); = 에러
        FTJB_staticMethod test = new FTJB_staticMethod();
        test.print2();

        // int num = 123;  -> 얜 main() 메서드 안에서만 살아있는 필드



        /*
            public class FTJB_staticMethod {
            static FTJB_staticMethod a = new FTJB_staticMethod();  정적 객체로 선언 시
            int num = 123;

            public static void print1() {
                int num2 = a.num;   // ✅ 가능
            }
        }
        */
    }

    public static void print1() {
        System.out.println("hello");
        // int num2 = num; => 에러. 어느 객체의 num인지 알 수 없기 때문에
    }

    public void print2() {
        System.out.println("java");
        int num3 = num;
    }
}
