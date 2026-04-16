package ai0326;

import java.util.Scanner;

public class LAB1 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in); // 문자열 입력용
        Scanner s2 = new Scanner(System.in); // 숫자 입력용
        System.out.println("========== 택배 배송 정보 입력 ==========");
        System.out.println("## 택배 보내기입니다. 다음을 각각 입력하세요 ##");
        System.out.print("받는 사람 : ");
        String name = s1.nextLine();
        System.out.print("주소 : ");
        String addr = s1.nextLine();
        System.out.print("무게(g) : ");
        int weight = s2.nextInt();
        // 입력 받은 내용을 사용해서 출력
        System.out.println();
        System.out.println("** 받는 사람 ==> " + name);
        System.out.println("** 주소 ==> " + addr);
        System.out.println("** 배송비 ==> " + (weight*5) + "원"); // 괄호를 사용해서 우선순위를 높여준다.
        s1.close();
        s2.close();

    }
}
