package shuzu;

import java.util.Arrays;
import java.util.Scanner;

public class Zifu {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
   Scanner sc=new Scanner(System.in);
   System.out.println("输入字符");
   String zf=sc.next();
   
   System.out.println("输入要查询的字符");
   String b=sc.next();
 
 int c=0;
   int d[]=new int[zf.length()];
   int a[] = new int [0];
   for(int i=0;i<zf.length();i++){
	  if(zf.substring(i, i+1).equals(b)){
		 
		  c++;
		  a = Arrays.copyOf(a, c);
		  a[c-1] = i;
	  }
   }
   for(int i=0;i<a.length;i++){
	   System.out.print(a[i]);
   }
   
   
	}
	

}
