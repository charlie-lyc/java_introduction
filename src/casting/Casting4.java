package casting;

public class Casting4 {

    public static void main(String[] args) {
        int div1 = 3 / 2;
        System.out.println("div1 = " + div1); //1

        double div2 = 3 / 2;
        System.out.println("div2 = " + div2); //1.0 // 두 정수 나눗셈에 대한 결과값으로 int로 *자동 형변환* -> 소수점 버림 -> 나눗셈의 결과값을 담는 변수의 타입 double로 *자동 형변환*

        double div3 = 3.0 / 2;
        System.out.println("div3 = " + div3); //1.5

        double div4 = 3 / 2.0;
        System.out.println("div4 = " + div4); //1.5

        double div5 = 3.0 / 2.0;
        System.out.println("div5 = " + div5); //1.5

        double div6 = (double) 3 / 2;
        System.out.println("div6 = " + div6); //1.5 // 두 정수 나눗셈에 대한 결과값에 대해 double로 *명시적 형변환* -> 나눗셈의 결과값 int로 자동 형변환 적용X -> 실수 결과값 유지

        int a = 3;
        int b = 2;
        double result = (double) a / b; // 결론적으로, 연산의 결과값을 연사의 대상과 다른 형(타입)으로 얻고자 한다면 연산에 대한 명시적 형변환이 이루어져야 함
        System.out.println("result = " + result); //1.5
    }
}
