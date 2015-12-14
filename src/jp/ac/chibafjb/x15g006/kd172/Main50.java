package jp.ac.chibafjb.x15g006.kd172;

public class Main50 {

	public static void main(String[] args) {
		int[] x={1,2,3};
		int[] y={7,8};
		int[] z= new int [x.length+y.length];
		System.out.print("z[]={");
		for(int i=0;i<x.length;i++)
			z[i] += x[i];
		for(int o=0+x.length;o<y.length+x.length;o++)
			z[o] += y[o-x.length];
		for(int p=0;p<x.length+y.length;p++)
			System.out.print(z[p]+",");
		System.out.print("}");

	}

}
