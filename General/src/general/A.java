package general;

import java.util.HashMap;

public class A  implements Cloneable{
	

	
	
	
	public static void main(String[] args) {
		map= new HashMap<Long,Long>();
		
		
		System.out.println(util(6));
		/*
		long t=util(3);
		long i=4;
		boolean flag=true;
		if(t%2==0) t=1; else t=0;
		while(flag) {
			long temp=util(i);
			if(temp%2==0)temp=1 ; else temp=0;
			if(t==temp) {
				i++;
			}else {
				flag=false;
			}
		}
		System.out.println(i);
		*/
	}
	
	static HashMap<Long,Long> map;
	
	public static long util(long x) {
		
		long i=0;
		long count=2;
		for(i=2;i<=x/2;i++) {
			if(x%i==0) { 
				long temp=x/i;
				
				count=1+util(x/i);
			}
		}
		
		return count;
	}
	
	
	//createuser(user user, string  typ){}
	
	

}
