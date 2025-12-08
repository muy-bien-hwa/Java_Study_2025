package FTJB_메서드_오버로딩;

/** 메서드 오버로딩 기본 내용 */

// 같은 클래스에서, 같은 메서드 명, 같은 매개변수 구성 → 컴파일 에러

class overloadingPrint {
    public void print(boolean b) { System.out.println("boolean value"); }
    public void print(int b) { System.out.println("integer value"); }
    public void print(float b) { System.out.println("float value"); }
    public void print(double b) { System.out.println("double value"); }
    public void print(String b) { System.out.println("String value"); }
    public void print(char b) { System.out.println("character value"); }
    public void print(char[] b) { System.out.println("character array value"); }
    public void print(int b, int c) { System.out.println("integer value, integer value"); }
    // 등등
}

public class FTJB_methodOverloading_1 {
    public static void main(String[] args) {
        // print a = new print(); 이거 안해도 되는 이유. 메서드를 왜 객체화 하냐 병신아?
        overloadingPrint op = new overloadingPrint();
        op.print(3);
        op.print(3.0);
        op.print(3.0f);
        op.print(new char[]{'a', 'b'});
        op.print('a');
        op.print("ABC");
        op.print(false);
        op.print(1,2);
        // op.print(1,2.0f);   -> 매개변수가 int, float 타입인 메서드가 없기 때문에 오류
    }
}
