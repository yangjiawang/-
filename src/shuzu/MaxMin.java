package shuzu;

import java.util.Scanner;

public class MaxMin {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// TODO 自动生成的方法存根
         int   max=0;
         int a =sc.nextInt();
         int b = sc.nextInt();
         int c=sc.nextInt();
         max=a;
         if(b>max){
        	 max=b;
        	 System.out.println("最大"+max);
         }
         if(c>max){
        	 max=c;
        	 System.out.println("最大"+max);
         }
	}

}
