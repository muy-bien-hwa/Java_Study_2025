import java.util.Arrays; // Arrays 클래스 들고오기

public class FTJB_multiArray {
    public static void main(String[] args) {
        // n차원 배열
        int[][] arr = new int[5][2]; // 5x2 의 2차원 배열
        arr = new int[][]{{1, 2}, {3, 4}}; // 이런 식으로도 가능

        int[][] arr1 = new int[5][]; // 이런 식으로 가변 2차원 배열 지정 가능
        for (int i = 0; i < 5; i++) {
            arr1[i] = new int[i+1];
            Arrays.fill(arr1[i], i); // Arrays의 fill 메소드 -> 배열 전부를 i로 채움
        }
        for(int num1[] : arr1){
            for(int num2 : num1){
                System.out.print(num2 + " ");
                // *** 공백 넣을 때 " "로 넣어야 됨, ' '는 char 타입이라 아스키코드(32)로 취급되서 숫자 덧셈으로 계산됨
            }
            System.out.println();
        }
    }
}
