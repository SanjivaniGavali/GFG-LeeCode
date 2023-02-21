//{ Driver Code Starts
import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])throws IOException
        {
            BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            while(t-->0)
                {
                    String s = br.readLine();
                    Solution ob = new Solution();
                    System.out.println(ob.reverseString(s));
                }
        }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public String reverseString(String s)
    {
        //code here.
        String ans="";
        Set<Character> set=new LinkedHashSet<>();
       // String str=s.replaceAll(" ","");
        StringBuilder str1=new StringBuilder();
        str1.append(s);
        str1.reverse();
        String input=str1.toString();
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)!=' '){
                set.add(input.charAt(i));
            }
        }
        for(Character ch:set){
            ans=ans+ch.toString();
        }
        
        return ans;
    }
}