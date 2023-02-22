//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


class Array {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		// looping through all testcases
		while(testcases-- > 0){
		    String line = br.readLine();
		    
		    Complete obj = new Complete();
		    String res = obj.maximumFrequency(line);
		    
		    System.out.println(res);
		}
	}
}


            




// } Driver Code Ends


//User function Template for Java

class Complete{
    
   
    // Function for finding maximum and value pair
    public static String maximumFrequency (String S) {
        //Complete the function
        Map<String,Integer> map=new LinkedHashMap<>();
        String[] arr=S.split(" ");
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                int i1=map.get(arr[i])+1;
                map.put(arr[i],i1);
            }else{
                map.put(arr[i],1);
            }
        }
        int maxVal=Collections.max(map.values());
        for(Map.Entry<String,Integer>e:map.entrySet()){
            if(maxVal==e.getValue()){
                return e.getKey()+" "+e.getValue();
            }
        }
        Map.Entry<String,Integer> entry = map.entrySet().iterator().next();
        return entry.getKey()+" "+entry.getValue();
        
    }
    
    
}
