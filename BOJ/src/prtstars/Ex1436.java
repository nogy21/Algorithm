package prtstars;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex1436 {
    public static void main(String[] args) throws NumberFormatException, IOException {
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        System.out.println(find666(N));
    }

    private static int find666(int n) {
    	int x=666;
    	int cnt=1;
    	while(cnt!=n) {
    		x++;
    		if(String.valueOf(x).contains("666"))
    			cnt++;
    	}
    	return x;
	}
}