/*
�Ҽ��� �Ʒ� ���ڰ� 11�� ������ �Ǽ� 1���� �Էµȴ�.
(��, �ԷµǴ� �Ǽ��� ������ +- 1.7*10-308 ~ +- 1.7*10308 �̴�.)
�Էµ� �Ǽ��� �Ҽ��� ���� 11�ڸ����� �ݿø��Ͽ� ����Ѵ�.
����. %.11lf �� ����ϸ� �Ҽ��� ���� 11�ڸ����� ��µȴ�.
 */
import java.util.Scanner;
public class Ex1029 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Double a = scan.nextDouble();
		System.out.println(String.format("%.11f", a));
	}

}
