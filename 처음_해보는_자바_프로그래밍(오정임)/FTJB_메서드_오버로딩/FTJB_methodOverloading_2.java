package FTJB_메서드_오버로딩;

/** 같은 클래스 안에서 메서드 호출 시 객체화 하는 법 */

public class FTJB_methodOverloading_2 {
    public void print(boolean b) { System.out.println("boolean value"); }
    public void print(int b) { System.out.println("integer value"); }
    public void print(float b) { System.out.println("float value"); }
    public void print(double b) { System.out.println("double value"); }
    public void print(String b) { System.out.println("String value"); }
    public void print(char b) { System.out.println("character value"); }
    public void print(char[] b) { System.out.println("character array value"); }

    public static void main(String[] args) {
        FTJB_methodOverloading_2 mop = new FTJB_methodOverloading_2();
        mop.print(123);
        // 같은 클래스 안에 있으면 이렇게 객체화
    }

}
