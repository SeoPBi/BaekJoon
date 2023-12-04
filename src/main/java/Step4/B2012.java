package Step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B2012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int arr[] = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        int rank[] = new int[N+1];
        for (int i = 1; i < N+1; i++) {
            rank[i] = arr[i-1];
        }

        long total = 0;
        for (int i = 1; i < N+1; i++) {
            total += Math.abs(i - rank[i]);
        }

        System.out.println(total);
    }
}
