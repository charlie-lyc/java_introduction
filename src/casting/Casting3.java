package casting;

public class Casting3 {

    public static void main(String[] args) {
        long maxIntValue = 2147483647; //int 최고값
        long maxIntOver = 2147483648L; //int 최고값 + 1(초과)
                        // 2147483649L //int 최고값 + 2(초과)
                        // 2147483650L //int 최고값 + 3(초과)
        int intValue = 0;

        /**
         * int 로 표현할 수 있는 범위 내의 값
         */
        intValue = (int) maxIntValue; //형변환, 2147483647 -> 2147483647 [값 그대로 표현]
        System.out.println("maxIntValue casting=" + intValue);

        /**
         * int 로 표현할 수 있는 범위를 넘는 값
         */
        intValue = (int) maxIntOver; //형변환, 2147483648L -> -2147483648 [int 로 표현할 수 있는 최저값에서 다시 시작되면서 표현] *오버플로우 현상*
                                     //형변환, 2147483649L -> -2147483647
                                     //형변환, 2147483650L -> -2147483646
        System.out.println("maxIntOver casting=" + intValue);
    }
}
