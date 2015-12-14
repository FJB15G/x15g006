package jp.ac.chibafjb.x15g006.kd165;

public class Main48 {

	public static void main(String[] args) {
		int m = 3;
		int a[] = new int[3];
		a[0] = 5;
		a[1] = 10;
		a[2] = 15;
		int b[] = new int[3];
		b[0] = 0;
		b[1] = 0;
		b[2] = 0;
		for(int i=3;i>0;i--)
			b[m-i]=a[i-1];
		for(int o=0;o<m;o++)
			System.out.println("b["+o+"]="+b[o]);
	}

}
