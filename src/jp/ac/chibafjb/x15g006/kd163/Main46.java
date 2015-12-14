package jp.ac.chibafjb.x15g006.kd163;

public class Main46 {

	public static void main(String[] args) {
		int n = 5;
		int x[] = new int[n];
		x[0] = 33;
		x[1] = 18;
		x[2] = 102;
		x[3] = 47;
		x[4] = 5;
		int i;
		int sum = 0;
		for(i=0;i<n;i++){
			sum = sum + x[i];
		}
		System.out.println("合計＝"+sum);

	}

}
