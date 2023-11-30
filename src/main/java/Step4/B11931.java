package Step4;

import java.io.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class B11931 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Integer arr[] = new Integer[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr, Collections.reverseOrder());

        for (int j = 0; j < arr.length; j++) {
            bw.write(String.valueOf(arr[j]) + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}

