package Step2;

import java.io.*;
import java.util.StringTokenizer;

public class B10951 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S;

        while((S = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(S);
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            System.out.println(A + B);
        }
    }
}
