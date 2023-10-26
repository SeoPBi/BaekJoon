package Step1;

import java.util.Scanner;

public class B2525_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        int input3 = sc.nextInt();

        if (input1 >= 0 && input2 >= 0) {
            if (input2 + input3 >= 60) {
                if ((input1 + ((input2 + input3) / 60)) < 24) {
                    System.out.printf("%d %d", input1 + ((input2 + input3) / 60), (input2 + input3) % 60);
                } else {
                    System.out.printf("%d %d", (input1 + ((input2 + input3) / 60)) % 24, (input2 + input3) % 60);
                }
            } else {
                System.out.printf("%d %d", input1, input2 + input3);
            }
        }
    }
}
