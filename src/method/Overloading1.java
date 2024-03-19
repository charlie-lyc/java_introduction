package method;

public class Overloading1 {

    public static void main(String[] args) {
        System.out.println("1: " + add(1,2));
        System.out.println("2: " + add(1,2,3));
    }

    public static int add(int a, int b) {
        System.out.println("1번 호출");
        return a + b;
    }

    public static int add(int a, int b, int c) {
        System.out.println("2번 호출");
        return a + b + c;
    }

    /**
     * Method Overloading: 메서드 이름은 같고 매개변수(들)는(은) 다른 여러 개의 메서드를 정의하는 것
     * <규칙>
     *  (1) "메서드 이름"이 같아도 <매개변수>의 [타입] 및 [순서]가 다르면 오버로딩 가능
     *  (3) 다른 매개변수 이름, 다른 반환형 은 인정되지 않음
     *      ex) 성공
     *          add(int a, int b)
     *          add(int a, int b, int c)
     *          add(double a, int b)
     *          add(int a, double b)
     *      ex) 실패
     *          int add(int a, int b)
     *          int add(int c, int d)
     *          double add(int a, int b)
     */
}
