package basic.implementation;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 주사위 세개
 */
public class Ex2480 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int firstDice = Integer.parseInt(st.nextToken());
        int secondDice = Integer.parseInt(st.nextToken());
        int thirdDice = Integer.parseInt(st.nextToken());

        int prize = 0;
        if (firstDice == secondDice && secondDice == thirdDice) {
            prize = 10000 + firstDice * 1000;
        } else if (firstDice == secondDice || firstDice == thirdDice || secondDice == thirdDice) {
            if (firstDice == secondDice || firstDice == thirdDice) {
                prize = 1000 + firstDice * 100;
            } else {
                prize = 1000 + secondDice * 100;
            }
        } else {
            int tmp = Math.max(firstDice, secondDice);
            tmp = Math.max(tmp, thirdDice);
            prize = 100 * tmp;
        }

        System.out.println(prize);
    }
}
