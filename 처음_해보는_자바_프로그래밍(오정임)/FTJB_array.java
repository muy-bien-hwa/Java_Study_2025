public class FTJB_array {
    /** 처음 해보는 자바 프로그래밍(오정임) 책 참고
     * 배열 기초
     * */

    public static void main(String[] args) {
        int[] arr1 = {10,20,30,40,50};
        // 타입[] 배열명 = {배열 ... }

        int[] arr2 = new int[5];
        // 빈 배열 정의, 길이 변경 x 재정의 해야함

        int[] arr3;
        arr3 = new int[] {50,40,30,20,10};
        // 위와 같이 정의 가능

        for(int num : arr3) {
            System.out.println(num);
        }
        // 출력 시 arr3 의 요소를 num에 넣어서 출력
    }
}

