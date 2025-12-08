package Test_Package;

/** 패키지와 외부 패키지(+외부 클래스) import 방법 */

/*
 * 이러면 이 클래스는 Test_Package에 속하게 됨
 *
 * 참고로 클래스의 접근 제한자는 다음과 같음.
 * [1] private : 같은 클래스에서만 접근 가능
 * [2] (defalut) : 접근 제한자 생략 시, 같은 패키지로 제한됨
 * [3] protected : 같은 패키지로 제한되지만, 다른 패키지와 상속 관계일 시 그 패키지에서도 접근 가능
 * [4] public : 다른 클래스, 다른 패키지여도 접근 가능 = 외부에 공개
 *
 * 다른 패키지에 있는 클래스를 끌어다 쓰려면 import를 해야함
 * // import 패키지명[.하위 패키지명].클래스명;
 * 으로 객체 끌어다 쓰기 가능.
 */

public class FTJB_Package {
    public static void main(String[] args) {

    }
}
