package variable;

public class Var8 {

    public static void main(String[] args) {
        /**
         * 정수 : int 를 기본 리터럴로 사용
         */
        byte b = 127;                 //-128 ~ 127                                             (2**8, 256)
        short s = 32767;              //-32,768 ~ 32,767                                       (2**16, 65536)
        int i = 2147483647;           //-2,147,483,648 ~ 2,147,483,647                         (2**32, 약 42억)
        //int j = 2147483648;         // 에러 발생 java: integer number too large
        //long k = 2147483648l;       // 소문자표시는 권장하지 않음
        long m = 2147483648L;         // OK
        long l = 9223372036854775807L;//-9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807 (2**64, 약 1844경 6천조)

        /**
         * 실수 : double 을 기본 리터럴로 사용
         */
        float f = 10.0f; // 약 -3.4E38 ~ 3.4E38, 7자리 정밀도   (4byte, 2**32)
        // float g = 10.0;  // 에러 발생 java: incompatible types: possible lossy conversion from double to float
        double d = 10.0; // 약 -1.7E308 ~ 1.7E308, 15자리 정밀도(8byte, 2**64)

        /**
         * 기타
         */
        boolean bool = true; // or false (1byte)
        char c = 'A';        // (1byte)

    }
}
