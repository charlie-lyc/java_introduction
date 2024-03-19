package method;

public class MethodValue2 {

    public static void main(String[] args) {
        int number = 5; //main 메서드(changeNumber 메서드 호출자)의 변수 : variable
        System.out.println("1. changeNumber 호출 전, number: " + number); //5
        changeNumber(number);
        System.out.println("4. changeNumber 호출 후, number: " + number); //5
    }

    public static void changeNumber(int number) { //changeNumber 메서드의 매개변수 : argument
        System.out.println("2. changeNumber 변경 전, number: " + number); //5
        number = number * 2;
        System.out.println("3. changeNumber 변경 후, number: " + number); //10
    }

    /**
     * main 메서드 내의 '변수'로서 number와  changeNumber 메서드 내의 '매개변수'로서 number 는
     * 이름만 같을 뿐 서로 다른 스코프(영역)을 가지는 변수이다.
     */
}
