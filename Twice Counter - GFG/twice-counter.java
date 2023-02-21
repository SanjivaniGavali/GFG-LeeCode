//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])throws IOException
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    String list[] = new String[n];
                    for(int i = 0;i<n;i++)
                        list[i] = sc.next();
                    Solution ob = new Solution();
                    System.out.println(ob.countWords(list, n));
                }
        }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int countWords(String list[], int n)
    {
        // code here 
        int count=0;
        Map<String,Integer> map=new LinkedHashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(list[i])){
                int i1=map.get(list[i])+1;
                map.put(list[i],i1);
                
            }else{
                map.put(list[i],1);
            }
        }
        for(Integer val : map.values()){
            if(val==2){
                count++;
            }
        }
        return count;
        
    }
}