package method.ex;

public class MethodEx3Ref {

    public static void main(String[] args) {
        // 현재 잔액
        int balance = 10000;

        // 입급 1000
        balance = deposit(balance, 1000);

        // 출금 2000
        balance = withdraw(balance, 2000);
        //balance = withdraw(balance, 12000);

        // 최종 잔액
        System.out.println("최종 잔액: " + balance + "원");
    }

    public static int deposit(int balance, int amount) {
        balance += amount;
        System.out.println(amount + "원을 입금하였습니다. 현재 잔액: " + balance + "원");
        return balance;
    }

    public static int withdraw(int balance, int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + "원을 출금하였습니다. 현재 잔액: " + balance + "원");
        } else {
            System.out.println(amount + "원을 출금하려 했으나 잔액이 부족합니다.");
        }
        return balance;
    }

    /**
     * Extract Method: 메서드 추출
     * 반드시 재사용의 목적이 아니어도 메서드를 적절하게 분류하고 추출하면 구조 파악 및 유지 보수가 수월해 진다.
     */
}