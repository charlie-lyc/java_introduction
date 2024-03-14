package scope;

public class Scope3_2 {

    public static void main(String[] args) {
        /**
         * 좀더 간단한 코드와 효율적인 메모리 사용을 위해
         * 적절한 스코프 적용이 필요
         */
        int m = 10;
        if (m > 0) {
            int temp = m * 2;
            System.out.println("temp = " + temp);
        }
        System.out.println("m = " + m);
    }
}
