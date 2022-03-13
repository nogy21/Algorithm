package basic.implementation;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 오븐 시계
 */
public class Ex2525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int requiredTime = Integer.parseInt(br.readLine());

        if (requiredTime + m >= 60) {
            t += (requiredTime + m) / 60;
            m = (requiredTime + m) % 60;
        } else {
            m += requiredTime;
        }

        if (t >= 24) {
            t -= 24;
        }

        System.out.println(t + " " + m);
    }
}
