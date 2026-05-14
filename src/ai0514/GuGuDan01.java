package ai0514;

public class GuGuDan01 {
    public static void main(String[] args) {
        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + "*" + j + "=" + (i * j));
            }
        }
            System.out.println();
    }
}

// 다른 방법 (교수님 풀이 방식)
// public class GuGuDan01 {
//    public static void main(String[] args) {
//        for (int i = 2; i <= 9; i++) {
//            for (int j = 1; j <= 9; j++) {
//                System.out.print("%d*%d=%d\t", i, j, i*j);
//        }System.out.println();
//     }
//  }