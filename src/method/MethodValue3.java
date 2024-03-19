package method;

public class MethodValue3 {

    public static void main(String[] args) {
        int num1 = 5;
        System.out.println("changeNumber 호출 전, num1: " + num1);
        num1 = changeNumber(num1);
        System.out.println("changeNumber 호출 후, num1: " + num1);
    }

    public static int changeNumber(int num2) {
        num2 = num2 * 2;
        return num2;
    }

    /**
     * main 메서드(changeNumber 메서드 호출자)의 변수의 값을 changeNumber 메서드를 이용해서 바꾸기 위해서는 Return Value(반환값)을 이용해야 한다.
     */
}
