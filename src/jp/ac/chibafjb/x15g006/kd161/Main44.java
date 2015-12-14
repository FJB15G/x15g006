package jp.ac.chibafjb.x15g006.kd161;

public class Main44 {

	public static void main(String[] args) {
		int test[] = new int[2];
		int work;
		test[0] = 10;
		test[1] = 20;
		work = test[0];
		test[0] = test[1];
		test[1] = work;
		int i;
		for(i=0;i<2;i++)
			System.out.println(test[i]);

	}

}
