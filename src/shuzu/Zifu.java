package shuzu;

import java.util.Arrays;
import java.util.Scanner;

public class Zifu {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
   Scanner sc=new Scanner(System.in);
   System.out.println("�����ַ�");
   String zf=sc.next();
   
   System.out.println("����Ҫ��ѯ���ַ�");
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
