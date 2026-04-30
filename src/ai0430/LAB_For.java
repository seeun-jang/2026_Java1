package ai0430;

public class LAB_For {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++)
        {
            System.out.print(i + "\t");
            if(i % 10 == 0)
                System.out.println();
        }
    }
}
