package Step4;

import java.io.*;
import java.util.StringTokenizer;

public class B10871 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] < X) {
                bw.write((arr[j]) + " ");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
