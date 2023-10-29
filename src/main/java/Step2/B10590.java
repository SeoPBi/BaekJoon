package Step2;

import java.util.Scanner;

public class B10590 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        for (int i = 1; i <= number; i++) {
            int input1 = sc.nextInt();
            int input2 = sc.nextInt();
            System.out.println(input1 + input2);
        }
    }
}
