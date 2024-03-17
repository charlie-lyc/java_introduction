package array;

public class Array1Ref4 {

    public static void main(String[] args) {
        int[] students = {90, 80, 70, 60, 50};

        //변수 값 사용
        for (int i = 0; i < students.length; i++) {
            System.out.println("학생" + (i + 1) + " 점수: " + students[i]);
        }

        /**
         * 배열 선언 단계에서 배열의 크기를 정하지 않을 경우 에러 발생
         */
        //int[] array = new int[]; // java: array dimension missing
        /**
         * 배열의 크기가 0일 경우 값을 대입하는 단계에서 에러 발생
         */
        //int[] array = {};
        //array[0] = 90; // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
        /**
         * 배열 선언 단계 이외에 {} 을 사용할 경우 에러 발생
         */
        // int[] array = new int[3];
        // array = {1, 2, 3}; // java: illegal start of expression

    }
}
