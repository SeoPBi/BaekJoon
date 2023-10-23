package Step1;

import java.util.Scanner;

public class B1008 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextInt();
        double b = scanner.nextInt();

        scanner.close();

        System.out.println(a/b);
    }
}
