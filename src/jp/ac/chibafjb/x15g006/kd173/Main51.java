package jp.ac.chibafjb.x15g006.kd173;

import java.util.Scanner;

public class Main51 {

	public static void main(String[] args) {
		int k = 3;
		int data[] = new int[4];
		Scanner sin = new Scanner(System.in);
		int a = sin.nextInt();
		int b = sin.nextInt();
		int c = sin.nextInt();
		int d = sin.nextInt();
		sin.close();
		data[0] = a;
		data[1] = b;
		data[2] = c;
		data[3] = d;
		for(int o=0;o<k+1;o++)
			System.out.println("data["+o+"]="+data[o]);

	}

}
