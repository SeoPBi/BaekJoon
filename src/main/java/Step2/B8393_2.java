package Step2;

import java.util.Scanner;

public class B8393_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= input; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}