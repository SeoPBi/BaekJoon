package Step2;

import java.io.*;

public class B15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int number = Integer.parseInt(br.readLine());

        for (int i = 0; i < number; i++) {
            String[] input = br.readLine().split(" ");
            int sum = Integer.parseInt(input[0]) + Integer.parseInt(input[1]);
            bw.write(String.valueOf(sum));
            bw.newLine();
        }
        bw.close();
        bw.flush();
        bw.flush();
    }
}
