package Step1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B14681 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int input1 = Integer.parseInt(br.readLine());
        int input2 = Integer.parseInt(br.readLine());

        if (input1 > 0) {
            if (input2 > 0) System.out.println("1");
            else System.out.println("4");
        } else if (input1 < 0) {
            if(input2 > 0) System.out.println("2");
            else System.out.println("3");
        }
    }
}
