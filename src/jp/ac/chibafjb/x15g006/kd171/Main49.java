package jp.ac.chibafjb.x15g006.kd171;

public class Main49 {

	public static void main(String[] args) {
		int k = 3;
		int data[] = new int[4];
		data[0] = 100;
		data[1] = 200;
		data[2] = 300;
		data[3] = 0;
		for(int i=k-1;i>=0;i--)
			data[i+1] = data[i];
		for(int o=0;o<k+1;o++)
			System.out.println("data["+o+"]="+data[o]);

	}

}
