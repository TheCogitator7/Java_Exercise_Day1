package kwon;

import java.util.Scanner;

public class Code07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb=new Scanner(System.in);
		int n=kb.nextInt();
		int[] data=new int[n];
		for(int i=0; i<n; i++) {
			data[i]=kb.nextInt();//1,2,3,4,5
		}
		kb.close();
		
		int tmp=data[n-1];
		for(int i=n-2; i>=0; i--) {//i=3
			data[i+1]=data[i];//data[4]=data[3]
		}
		data[0]=tmp;
		
		for(int i=0; i<n; i++) {
			System.out.println(data[i]);
		}

	}

}
