package Step3;

import java.io.*;
import java.util.StringTokenizer;

public class B10952_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str, " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int sum = a + b;

            if (sum == 0) break;

            bw.write(String.valueOf(sum));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
