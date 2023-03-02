//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GfG{
	public static void main(String[] args) throws IOException{
		BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
			int n = Integer.parseInt(br.readLine().trim());
			int a[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++)
                a[i] = Integer.parseInt(inputLine[i]);
			
			Solution ob = new Solution();
			System.out.println(ob.maxDiffIndex(a, n));
		}
	}
	
}
// } Driver Code Ends




class Solution
{
	public int maxDiffIndex(int A[], int N)
	{
	    LinkedHashMap<Integer,Integer>map1=new LinkedHashMap<>();
	    LinkedHashMap<Integer,Integer>map2=new LinkedHashMap<>();
	    for(int i=0;i<N;i++){
	        if(map1.containsKey(A[i])==false){
	            map1.put(A[i],i);
	        }
	        map2.put(A[i],i);
	    }
	    int maxi=Integer.MIN_VALUE;
	    for(int i=0;i<N;i++){
	        int first=map1.get(A[i]);
	        int last=map2.get(A[i]);
	        int current=last-first;
	        maxi=Math.max(maxi,current);
	    }
	   return maxi;
	}
}