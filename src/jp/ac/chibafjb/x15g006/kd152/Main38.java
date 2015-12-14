package jp.ac.chibafjb.x15g006.kd152;

import java.util.Scanner;

public class Main38 {

	public static void main(String[] args) {
	Scanner sin = new Scanner(System.in);
	System.out.print("半径r -->");
	float a = sin.nextFloat();
	sin.close();
	System.out.println("円周="+2*3.14*a);
	System.out.println("面積="+3.14*a*a);

	}

}
