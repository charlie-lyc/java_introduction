package operator;

public class Logical2 {

    public static void main(String[] args) {
        int a = 15;

        /**
         * ex) a는 10보다 크고 20보다 작다
         */
        boolean result1 = a > 10 && a < 20;
        System.out.println("result = " + result1);

        boolean result2 = (a > 10) && (a < 20);   //가독성 중가
        System.out.println("result = " + result2);

        boolean result3 = 10 < a && a < 20;       //가독성 증가
        System.out.println("result = " + result3);
    }
}
