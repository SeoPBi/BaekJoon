package Step1;

import java.util.Scanner;

public class B2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        int input3 = sc.nextInt();

        if (input2 >= 0 && input2 < 60 && input1 >= 0 && input1 < 24) {
            if (input2 + input3 < 60) System.out.printf("%d %d", input1, input2 + input3);
            else {
                if (input2 + input3 > 60) {
                    if (input2 + (input3 % 60) == 60) System.out.printf("%d %d", input1 + (input3 / 60) + 1, 0);
                    else System.out.printf("%d %d", input1 + (input3 / 60), input2 + (input3 % 60));
                }
            }
        }
    }
}
