package Step2;

import java.util.Scanner;

public class B25314 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

        for (int i = 4; i <= input; i += 4) {
            System.out.print("long ");
        }
        System.out.print("int");
    }
}
