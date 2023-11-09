package Step2;

import java.io.*;

public class B10952_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String[] input = br.readLine().split(" ");
            int number1 = Integer.parseInt(input[0]);
            int number2 = Integer.parseInt(input[1]);

            if (number1 == 0 && number2 == 0) break;

            int sum = number1 + number2;
            bw.write(String.valueOf(sum));
            bw.newLine();
        }
        bw.flush();
        bw.close();

    }
}
