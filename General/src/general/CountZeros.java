package general;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountZeros {

	public static void main(String[] args) {
		int n=32;
		int m=78;
		int[] dp=new int[m+1];
		Arrays.fill(dp, -1);
		System.out.println(util(n,m,dp));
		
		//solve()
		 
	}

	
	
	public static int util(int n,int m,int dp[]) {
	  if(n==m)
		  return 0;
	 
	  if(n>m) {
		  return Integer.MAX_VALUE/10;
	  }
	  	
	  ArrayList<Integer> res = getList(n);
	  int min=Integer.MAX_VALUE/10;
	  
	  if(dp[n]!=-1)return dp[n]; 
	  int temp=0;
	  for(int i:res) {
		  temp=(n/i)+util(n+i,m,dp);
		  if(temp<min) {
			  min=temp;
		  }
	  }
	  dp[n]=min;
	 return min;
	
	}
	public static ArrayList<Integer> getList(int a){
		ArrayList<Integer> l= new ArrayList<Integer>();
		
		for(int i=2;i<a;i++) {
			if(i%2==0 && a%i==0) {
				l.add(i);
			}
				
		}
		for(int i:l) {
			//System.out.println("a:    "+a+" i is  :"+i);
		}
		return l;
	}
	
	static long[] solve(int len,int[][] a) {
		HashMap<Integer,Integer> map= new HashMap<Integer,Integer>();
		ArrayList<Long> res = new ArrayList<>();
		int count=0;
		for(int i=0;i<len;i++) {
			if(a[i][0]==1) {
				map.put(count+1, a[i][0]);
			}else if(a[i][0]==2) {
				map.remove(a[i][0]);
				res.add((long) a[i][0]);
			}else {
				long t=0;
				
				for(Map.Entry<Integer, Integer> m: map.entrySet()) {
					long temp=Math.abs(m.getValue()-a[i][1]);
					
					if(temp>t)
						t=temp;
				}
				res.add(t);
			}
		}
		long[] f= new long[res.size()];
		for(int i = 0;i<res.size();i++) {
			f[i]=res.get(i);
		}
		return f;
	}
	
		
		
	
}
