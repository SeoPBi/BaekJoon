package Step4;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;

public class B11931_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Integer arr[] = new Integer[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr, Collections.reverseOrder());

        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\n");
        }
    }
}
