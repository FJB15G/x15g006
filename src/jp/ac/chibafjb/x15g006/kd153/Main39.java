package jp.ac.chibafjb.x15g006.kd153;

import java.util.Scanner;

public class Main39 {

	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		System.out.print("半径r -->");
		float a = sin.nextFloat();
		sin.close();
		System.out.println("円周="+Math.round(2*3.14*a*10.f)/10.f);
		System.out.println("面積="+Math.round(3.14*a*a*10.f)/10.f);

	}

}
