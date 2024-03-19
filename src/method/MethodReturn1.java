package method;

public class MethodReturn1 {

    public static void main(String[] args) {
        boolean result = odd(2);
        System.out.println(result);
    }

    public static boolean odd(int i) {
        if (i % 2 == 1) { return true; }
        //에러 발생, 어떤 경우든 항상 boolean 타입의 반환이 있어야 함  // java: missing return statement
        // 따라서 아래와 같이 if 구문을 완성해 주어야 함
        else { return false; }
    }
}
