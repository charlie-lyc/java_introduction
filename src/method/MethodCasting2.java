package method;

public class MethodCasting2 {

    public static void main(String[] args) {
        int number = 100;
        printNumber(number);
    }

    public static void printNumber(double n) { // 앞서 배운바대로 int -> double 의 경우 묵시적(자동) 형변환이 적용된다!!!
        System.out.println("숫자: " + n);
    }

}
