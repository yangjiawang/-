package shuzu;

import java.util.Random;

public class QIU {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
   Random a=new Random();
   int b[]=new int[33];
   int aa[] = new int [6];
   int i = 0;
   	while(true){
   		int sum = (int)(a.nextInt(33)+1);
   			
   		for(int j = 0 ; j <=i;j++){
   			if(sum == aa[j]){
   				break;
   			}
   			if(i == j){
   				System.out.println(sum);
   				aa[i] = sum;
   				i++;
   				break;
   			}
   		}
   		
   		if(i==6){
   			break;
   		}
   	}
   	
   /*	for(int ii : aa){
   		System.out.println(ii);
   	}*/

		
		
		
		
		
		
	}

}
