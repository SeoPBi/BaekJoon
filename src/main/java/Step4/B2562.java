package Step4;

import java.io.*;

public class B2562 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int arr[] = new int[9];
        int max = Integer.MIN_VALUE;
        int maxIndex = 0;

        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        for (int j = 0; j < arr.length; j++) {
            if (max < arr[j]) {
                max = arr[j];
                maxIndex = j + 1;
            }
        }
        System.out.println(max);
        System.out.println(maxIndex);
    }
}
