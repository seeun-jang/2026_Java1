package ai0423;

import java.util.Scanner;

public class LAB4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("* 나이 입력: ");
        int age = s.nextInt();
        String result = "" ;

        if (age >= 19)
            result = "즐거운 시간 되세요.^^";
        else if (age <= 18)
            result = "당장 나가";

        System.out.println("피시방에서 " + result );

        s.close();
    }
}
