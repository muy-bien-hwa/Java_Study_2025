package FTJB_메서드_오버로딩;

/** 가변 길이 인자 내용 + 복합 인자 선언 */

/*
 * test(1), test(1,2), test(1,2,3) 와 같이 메서드를 호출하려 할 때
 * void test(int a) {}
 * void test(int a, int b) {}
 * ... 이런 식으로 설계할 수도 있겠지만, 더 간결하게 하려면 "가변 길이 인자" 를 사용하면 됨
 * 메서드 이름(데이터 타입... 변수명) {} 으로 사용 가능
 */

import java.util.Arrays;

public class FTJB_methodOverloading_3 {
    static void test(int... arr) {   // 이때 arr은 int 타입의 배열로 저장됨
        System.out.print(arr.length + " : ");
        for(int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    static void testplus(int[] arr) {
        for(int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    static void test(String name, int... arr) {
        System.out.print(name + " : ");
        for(int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        test(1);  // test 메서드가 static 이므로 객체 생성 없이 바로 호출 가능
        test(1,2);
        test(1,2,3);
        // testplus(1,2,3,4,5); 이건 오류. int array를 넘긴 게 아니라 int, int, int ... 를 넘김
        testplus(new int[]{1,2,3,4,5}); // 매개변수가 int[] 이라면 이렇게 넘겨야 함

        test("array", 1,2,3,4,5);
        test("점수", 98, 100, 87);
    }
}
