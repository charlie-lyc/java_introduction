package operator;

public class Operator1 {

    public static void main(String[] args) {
        //변수 초기화
        int a = 5;
        int b = 2;

        // 덧셈
        int sum = a + b;
        System.out.println("a + b = " + sum); //출력 a + b = 7

        // 뺄셈
        int diff = a - b;
        System.out.println("a - b = " + diff);

        // 곱셈
        int multi = a * b;
        System.out.println("a * b = " + multi);

        // 나눗셈 [몫]
        int div = a / b;
        System.out.println("a / b = " + div); // 2

        // [나머지]
        int mod = a % b;
        System.out.println("a % b = " + mod);

        /**
         * Reference1
         */
        double d = 5;
        double e = 2;
        double result1 = d / e;
        System.out.println("a / b = " + result1); // 2.5

        /**
         * Reference2
         */
        int z = 0;
        // int result2 = a / z; // 에러 발생 Exception in thread "main" java.lang.ArithmeticException: / by zero

    }
}
