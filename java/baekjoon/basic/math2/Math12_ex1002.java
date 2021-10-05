package basic.math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Math12_ex1002 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int r1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			int r2 = Integer.parseInt(st.nextToken());

			System.out.println(findLocation(x1, y1, r1, x2, y2, r2));
		}
	}

	private static int findLocation(int x1, int y1, int r1, int x2, int y2, int r2) {
		int d = (int) (Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		// 1. 반지름과 원의 중심이 동일한 원
		if (x1 == x2 && y1 == y2 && r1 == r2) return -1;
		// 2-1. 중심 동일, 반지름이 다른 경우
		else if(x1==x2&&y1==y2)	return 0;
		// 2-2. 큰 원 안에 작은 원, 내접하지 않음 (중심으로부터의 거리가 반지름의 차보다 작은 경우)
		else if (d < Math.pow(r1 - r2, 2)) return 0;
		// 2-3. 서로 멀리 떨어진 원 (중심으로부터의 거리가 반지름의 합보다 큰 경우)
		else if (d > Math.pow(r1 + r2, 2)) return 0;
		// 3-1. 접점이 하나인 경우(외접)
		else if (d == Math.pow(r1 + r2, 2)) return 1;
		// 3-2. 접점이 하나인 경우(내접)
		else if (d == Math.pow(Math.abs(r1 - r2), 2)) return 1;
		// 접점이 둘
		else return 2;
	}
}