package scope;

public class Scope1 {

    public static void main(String[] args) {
        /**
         * 지역 변수 : 코드 블럭 {} 내에서 접근 가능
         * m -> main() { ... }
         * x -> if () { ... }
         */
        int m = 10; //m 생존 시작

        if (true) {
            int x = 20; //x 생존 시작
            System.out.println("if m = " + m);
            System.out.println("if x = " + x);
        } //x 생존 종료

        //System.out.println("main x = " + x); //에러 발생 // java: cannot find symbol // symbol:   variable x // location: class scope.Scope1
        System.out.println("main m = " + m);
    } //m 생존 종료
}
