package greedy;

import java.util.Scanner;

public class ex1 {

/**
 * 거스름 돈 문제
 * 거스름돈으로 사용할 500원, 100원, 50원, 10원짜리 동전이 무한히 존재.
 * 손님에게 거슬러 줄 돈이 N원일 때 동전의 최소 개수(N은 항상 10의 배수이다)
 */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int cnt = 0;
        int[] coinType = {500, 100, 50, 10};

        for(int m : coinType) {
            cnt += n / m;
            n = n % m;
        }

        System.out.println(cnt);

    }

}