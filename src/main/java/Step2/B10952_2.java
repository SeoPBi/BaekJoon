package Step2;

import java.io.*;

public class B10952_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String[] a = br.readLine().split(" ");
            int num1 = Integer.parseInt(a[0]);
            int num2 = Integer.parseInt(a[1]);

            if (num1 == 0 && num2 == 0) {
                break;
            }

            int sum = num1 + num2;
            bw.write(String.valueOf(sum));
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
