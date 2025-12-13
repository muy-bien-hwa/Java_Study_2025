/** 정적 멤버 중 정적 필드(클래스 필드) */

// 어떤 클래스로 만든 인스턴스들이 모두 공유하는 멤버가 필요할 때, 정적 멤버(static member) 를 사용하면 좋음.
// 특정 인스턴스만 사용하는 것이 아닌, 해당 클래스로 생성한 모든 인스턴스가 공유하는 것.

// 클래스 필드는 참조변수가 필요 없음.
// => main() 메서드 실행 전에 이미 코드 메모리에 생성되어있기 때문.
// 객체 생성 없이 바로 클래스명.필드명 으로 접근 가능.

class Count{
    public static int totalCount;
    int count;
}

public class FTJB_static_field {
    public static void main(String[] args) {
        Count.totalCount++; // 정상. static 선언을 한 클래스 필드이기 때문에 바로 접근 가능.
        // count++; -> 에러, 인스턴스 필드이기 때문에 인스턴스를 먼저 생성해줘야 함.
        Count cnt = new Count();
        cnt.count++;
        // cnt.totalCount++; -> 에러는 아니지만 인스턴스 필드로 착각할 수 있기 때문에 보통 이렇게 사용 X
        Count.totalCount++;
        System.out.println("total : " + Count.totalCount + "  cnt : " + cnt.count);  // total : 2  cnt : 1

        // 각 인스턴스에 count라는 인스턴스 변수가 있고, 서로 공유하는 클래스 필드인 totalCount가 있음
        Count c1 = new Count();
        Count c2 = new Count();
        Count c3 = new Count();

        c1.count++;
        Count.totalCount++;
        c2.count++;
        Count.totalCount++;
        c3.count++;
        Count.totalCount++;

        System.out.println("c1 : " + c1.count + "  c2 : " + c2.count + "  c3 : " + c3.count + "  total : " + Count.totalCount);
        // c1 : 1  c2 : 1  c3 : 1  total : 5
    }
}
