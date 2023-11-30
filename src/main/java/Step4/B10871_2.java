package Step4;

import java.io.*;
import java.util.StringTokenizer;

public class B10871_2 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int X = Integer.parseInt(st.nextToken());
        int Y = Integer.parseInt(st.nextToken());

        int[] arr = new int[X];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < X; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int j = 0; j < X; j++) {
            if (arr[j] < Y) {
                bw.write(arr[j] + " ");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
