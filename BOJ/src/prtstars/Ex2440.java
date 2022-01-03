package prtstars;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2440 {
    public static void main(String[] args) throws NumberFormatException, IOException {
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        prtStars(N);
    }

    private static void prtStars(int n) {
    	for(int i=0;i<n;i++) {
    		for(int j=i;j<n;j++)
    			System.out.print("*");
    		System.out.println();
    	}
	}
}