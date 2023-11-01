package Step2;

import java.io.*;

public class B11022 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int number = Integer.parseInt(br.readLine());

        for (int i = 1; i <= number; i++) {
            String[] input = br.readLine().split(" ");
            int sum = Integer.parseInt(input[0]) + Integer.parseInt(input[1]);
            bw.write("Case #" + i + ": " + input[0] + " + " + input[1] + " = " + String.valueOf(sum));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
