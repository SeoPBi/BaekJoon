package Step4;

import java.io.*;
import java.util.StringTokenizer;

public class B10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int count = 0;
        int arr[] = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int selet = Integer.parseInt(br.readLine());

        for (int j = 0; j < arr.length; j++) {
            if (selet == arr[j]) {
                count++;
                System.out.println(count);
            } else System.out.println("0");
        }
    }
}
