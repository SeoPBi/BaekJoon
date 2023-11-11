package Step2;

import java.io.*;

public class B11382_2 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += Integer.parseInt(input[i]);
        }

        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
    }
}
