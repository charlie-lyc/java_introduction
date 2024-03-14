package casting;

public class Casting2 {

    public static void main(String[] args) {
        /**
         * 명시적 형변환
         */
        double doubleValue = 1.5;
        int intValue = 0;

        //intValue = doubleValue; //컴파일 오류 발생 // java: incompatible types: possible lossy conversion from double to int
        intValue = (int) doubleValue; //형변환, 1.5 -> 1 *소수점버림 현상*
        System.out.println(intValue);
    }
}
