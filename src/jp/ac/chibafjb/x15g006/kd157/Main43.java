package jp.ac.chibafjb.x15g006.kd157;

import java.util.Scanner;

public class Main43 {

	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		System.out.print("ハンバーガーの個数→");
		int a = sin.nextInt();
		System.out.print("フライドポテトの個数→");
		int b = sin.nextInt();
		System.out.print("受取金額→");
		int c = sin.nextInt();
		sin.close();
		System.out.println("ハンバーガーの代金＝"+(100*a)+"円");
		System.out.println("フライドポテトの代金＝"+(180*b)+"円");
		System.out.println("小計＝"+(100*a+180*b)+"円");
		System.out.println("消費税＝"+(int)Math.floor((100*a+180*b)*0.08)+"円");
		System.out.println("合計金額"+((100*a+180*b)+(int)Math.floor((100*a+180*b)*0.08))+"円");
		System.out.println("つり銭"+(c-((100*a+180*b)+(int)Math.floor((100*a+180*b)*0.08))+"円"));

	}

}
