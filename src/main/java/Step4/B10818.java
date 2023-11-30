package Step4;

import java.io.*;
import java.util.StringTokenizer;

public class B10818 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int arr[] = new int[N];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int j = 0; j < arr.length; j++) {
            if (max < arr[j]) {
                max = arr[j];
            }

            if (min > arr[j]) {
                min = arr[j];
            }
        }
        System.out.println(min + " " + max);
    }
}
