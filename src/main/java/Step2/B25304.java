package Step2;

import java.util.Scanner;

public class B25304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int money = 0;
        int item = 0;
        int sum = 0;
        int result = sc.nextInt();
        int number = sc.nextInt();

        for (int i = 1; i <= number; i++) {
            money = sc.nextInt();
            item = sc.nextInt();
            sum += money * item;
        }

        if (sum == result) System.out.println("Yes");
        else System.out.println("No");
    }
}
