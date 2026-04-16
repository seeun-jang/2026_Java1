package calculator.test;

public class LAB3 {
    public static void main(String[] args) {
        int total = 0;

        total -= 900 * 10; // total = total - 900 * 10;
        total += 1800 * 2; // total = total + 1800 * 2;
        total -= 3500 * 5;
        total += 4000 * 4;
        total += 1500;
        total += 2000 * 4;
        total += 1800 * 5;

        System.out.println("편의점 총매출액: " + total + "원");
        // int a = 이런 방식으로 해결할 수 없는지 찾아보기. ex) int coke = 1800;
    }
}
