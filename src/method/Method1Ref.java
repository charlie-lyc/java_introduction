package method;

public class Method1Ref {

    public static void main(String[] args) {
        //계산1
        int sum1 = add(5, 10);
        System.out.println("결과1 출력: " + sum1);

        //계산2
        int sum2 = add(15, 20);
        System.out.println("결과2 출력:" + sum2);
    }

    //add 메서드
    public static int add(int a, int b) {
        System.out.println(a + "+" + b + " 연산 수행");
        int sum = a + b;
        return sum;
    }

//    static int add(int a, int b) {
//        System.out.println(a + "+" + b + " 연산 수행");
//        int sum = a + b;
//        return sum;
//    }

    /**
     * 1. Modifier : 제어자
     *  (1) public: 다른 클래스에서도 호출하여 사용할 수 있는 메서드라는 의미
     *  (2) static: 객체 생성을 하지 않고 호출하여 사용할 수 있는 메서드라는 의미
     * 2. Return Type : 메서드 실행 결과를 반환할 때 사용하는 타입(반환 타입 또는 반환형)
     *  (1) void : 반환 타입이 없을 경우
     *  (2) int(, byte, short, long)
     *  (3) double(, float)
     *  (4) String(, char)
     *  (5) boolean
     * 3. Method Name: 호출할 때 사용하는 메서드 이름
     *  ex) add
     * 4. Parameter: 외부로 부터 입력되는 값으로 메서드 외부에서 사용할 수 있는 변수(매개 변수)
     *              옵션 사항이므로 입력값이 필요없을 경우 지정하지 않음
     *  ex1) add(x, y)
     *  ex2) add()
     * 5. Method Body: 중괄호 {} 내에 작성된 실제 작동되는 코드
     *  ex3) add(int x, int y) { ... }
     */

}
