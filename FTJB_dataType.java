public class FTJB_dataType {
    public static void main(String[] args) {
        int g = 23;
        //byte h = g;  ->  오류남. int가 더 큰 데이터 타입인데 byte에 넣으려고 하니까
        byte h = (byte)g; // 이렇게 강제로 바꿔줘야 함. = 타입 캐스팅

        byte i = 10;
        byte j = 20;
//        byte k = i + j; 이렇게 하면 오류남. 연산자를 이용하여 숫자를 연산할 땐 정수는 int 타입으로 변환되서 연산을 수행하기 때문
        byte k = (byte)(i + j); // 이렇게 묶어서 타입 캐스팅 해줘야 함

        // char 타입은 문자 하나를 저장하는 것 처럼 보이지만, 문자의 유니코드 값을 저장하는 거임.
        char letter = 'A';  // 작은 따옴표
        char[] alphabet = new char[26];

        for (int l = 0; l < alphabet.length; l++) {
            alphabet[l] = (char)(letter+l);
        }
        for(char c : alphabet){
            System.out.print(c);
        }
        // 이런식으로 응용 가능
    }
}
