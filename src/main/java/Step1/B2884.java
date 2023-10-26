package Step1;

import java.util.Scanner;

public class B2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input1 = sc.nextInt();
        int input2 = sc.nextInt();

        sc.close();

        if (input2 > 0 && input2 < 60 && input1 > 0 && input1 < 24) {
            if (input2 > 45) System.out.printf("%d %d", input1, input2 - 45);
            else if (input2 < 45) System.out.printf("%d %d", input1 - 1, 60 + (input2 - 45));
            else System.out.printf("%d %d", input1, 0);
        } else if (input1 == 0) {
            if (input2 > 45) System.out.printf("%d %d", input1, input2 - 45);
            else if (input2 < 45) System.out.printf("%d %d", 23, 60 + (input2-45));
            else System.out.printf("%d %d", 0, 0);
        }
    }
}
