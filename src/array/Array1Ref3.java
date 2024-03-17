package array;

public class Array1Ref3 {

    public static void main(String[] args) {
        //int[] students; //배열 변수 선언
        //students = new int[]{90, 80, 70, 60, 50}; //배열 생성과 초기화

        /**
         * 배열변수 선언과 배열 생성 및 초기화 : 값(들)을 포함한 배열 생성
         */
        //int[] students = new int[5]{90, 80, 70, 60, 50}; //에러 발생 // java: array creation with both dimension expression and initialization is illegal
        int[] students = new int[]{90, 80, 70, 60, 50};

        //변수 값 사용
        for (int i = 0; i < students.length; i++) {
            System.out.println("학생" + (i + 1) + " 점수: " + students[i]);
        }
    }
}
