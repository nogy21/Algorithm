package prtstars;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2439 {
    public static void main(String[] args) throws NumberFormatException, IOException {
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        prtStars(N);
    }

    private static void prtStars(int n) {
    	for(int i=0;i<n;i++) {
    		for(int j=i+1;j<n;j++)
    			System.out.print(" ");
    		for(int k=0;k<=i;k++)
    			System.out.print("*");
    		System.out.println();
    	}
	}
}