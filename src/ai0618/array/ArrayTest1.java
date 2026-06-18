package ai0618.array;

import java.util.Scanner;

public class ArrayTest1 {
    public static void main(String[] args) {
        // 5개의 성적을 입력받아서 저장할 수 있는 1차원 배열객체 생성
        int[] scores = new int[5];
        String[] subjects = {"프로그래밍언어실습", "데이터베이스", "융합UI실습", "영상인공지능처리", "인공지능개론", "직업과경력개발"};
        int sum = 0;

        // 콘솔창에서 키보드로 입력한 성적을 가져와서 배열에 저장
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < scores.length; i++) {
            System.out.print("- " + subjects[i] + "성적 입력(정수값): ");
            scores[i] = s.nextInt(); // i번째 배열 칸에 저장
        }

        // 배열에 저장된 성적 한 줄로 출력
        System.out.print("입력된 성적: ");
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + " ");
        }
//         enhanced(개선된) for
        int i = 0;
        for (int score : scores) {
            System.out.print(subjects[i] + ":" + score + " ");
            sum += score;
            i++;
        }
//        }

        // 전체 합계 계산

//        for (int i = 0; i < scores.length; i++) {
//            sum += scores[i];
//        }

        // 다음 줄에 합계 출력
        System.out.println();
        System.out.println("전체 합계: " + sum);
        System.out.println("평균: " + sum/scores.length);

        s.close();
    }
}