package operator;

public class OperatorAdd2 {

    public static void main(String[] args) {
        int a = 1;
        int b = 0;

        /**
         * 전위 증감 연산자
         */
        b = ++a; //a의 값을 먼저 증가시키고, 그 결과를 b에 대입
        System.out.println("a = " + a + ", b = " + b);


        a = 1; //a 값을 다시 1로 지정
        b = 0; //b 값을 다시 0으로 지정

        /**
         * 후위 증감 연산자
         */
        b = a++; //a의 현재 값을 b에 먼저 대입하고, 그 후 a 값을 증가시킴
        System.out.println("a = " + a + ", b = " + b); //결과: a = 2, b = 1

        /**
         * 참고 예시
         */
        a = 1;
        System.out.println(++a); //2
        a = 1;
        System.out.println(a++); //1
        System.out.println(a);   //2

        /**
         * 단독으로 사용하는 경우에는 전위든 후위든 결과가 같음
         */
        a = 1;
        ++a;
        System.out.println(a); //2
        a = 1;
        a++;
        System.out.println(a); //2
    }
}
