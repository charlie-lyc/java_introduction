package cond;

public class Switch4 {

    public static void main(String[] args) {
        int grade = 2;

        /**
         * Java 14에서 처음 도입
         */
        int coupon = switch (grade) {
            case 1 -> 1000;
            case 2 -> 2000;
            case 3 -> 3000;
            default ->  500;
        };
        System.out.println("발급받은 쿠폰 " + coupon);
    }
}
