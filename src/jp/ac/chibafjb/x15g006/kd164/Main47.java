package jp.ac.chibafjb.x15g006.kd164;

public class Main47 {

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
		for(int i=0;i<m;i++)
			b[i]=a[i];
		for(int o=0;o<m;o++)
			System.out.println("b["+o+"]="+b[o]);

	}

}
