package ai0430;

import java.util.Scanner;

public class LAB_Switch {
    public static void main(String[] args) {
        // 출생년도를 입력받는다.
        Scanner s = new Scanner(System.in);
        System.out.print("========== 출생년도에 따른 12간지 ==========");
        System.out.print("- 출생년도 입력: ");
        int birthYear = s.nextInt();
        String animal = "";

        switch (birthYear % 12) {
            case 0:
                System.out.println("당신은 원숭이띠입니다.");
                break;
            case 1:
                System.out.println("당신은 닭띠입니다.");
                break;
            case 2:
                System.out.println("당신은 개띠입니다.");
                break;
            case 3:
                System.out.println("당신은 돼지띠입니다.");
                break;
            case 4:
                System.out.println("당신은 쥐띠입니다.");
                break;
            case 5:
                System.out.println("당신은 소띠입니다.");
                break;
            case 6:
                System.out.println("당신은 호랑이띠입니다.");
                break;
            case 7:
                System.out.println("당신은 토끼띠입니다.");
                break;
            case 8:
                System.out.println("당신은 용띠입니다.");
                break;
            case 9:
                System.out.println("당신은 뱀띠입니다.");
                break;
            case 10:
                System.out.println("당신은 말띠입니다.");
                break;
            case 11:
                System.out.println("당신은 양띠입니다.");
                break;
            default:
                animal = "잘못된 출생년도입니다.";

        }

        s.close();
    }
}
