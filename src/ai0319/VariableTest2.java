package ai0319;

public class VariableTest2 {
    public static void main(String[] args) {
        int num1, num2, result, result2, result3;

        num1 = 300;
        num2 = 500;
        result = num1 + num2;
        result2 = num1 * num2;
        result3 = num1 / num2;
//        result = 10;
        // 지역변수는 꼭 초기화를 합니다.
        System.out.println(num1 + " + " + num2 + " = " + result);
        System.out.printf("%d + %d = %d\n", num1, num2, result);
        System.out.printf("%d × %d = %d\n", num1, num2, result2);
        System.out.printf("%d ÷ %d = %d\n", num1, num2, result3);
        // 정수를 정수로 나누면 0이 나오고, 실수로 바꿔야 0.xxx 이렇게 나온다.
    }
}
