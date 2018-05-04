package shuzu;

public class ShengFengZheng {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
     String a="52242619811105565X";
     String lastone=a.substring(a.length()-1);
     int sum=0;
     String e=null;
     int b[]={7,9,10,5,8,4,2,1,6,3,7,9,10,5,8,4,2};
		if(a.length()==18){
			for(int i=0;i<17;i++){
				Integer temp=Integer.parseInt(a.substring(i, i+1));
				sum+=temp*b[i];
			
			}
			int d=sum%11;
			switch(d){
			case 0: e="1"; break;
			case 1: e="0"; break;
			case 2: e="X"; break;
			case 3: e="9"; break;
			case 4: e="8"; break;
			case 5: e="7"; break;
			case 6: e="6"; break;
			case 7: e="5"; break;
			case 8: e="4"; break;
			case 9: e="3"; break;
			case 10: e="2"; break;
			}
			if(e.equals(lastone)){
				System.out.println("合法");
			}else{
				System.out.println("不合法");
			}
		}else{
			System.out.println("不合法");
		}
		
		
		
	}

}
