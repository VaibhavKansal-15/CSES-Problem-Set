import java.io.*;
import java.util.*; 

public class MaximumSubarraySum {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int[] arr=new int[n];
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        long count=arr[0];
        long currentSum=arr[0];
        for(int i=1;i<n;i++){
            currentSum=Math.max(currentSum+arr[i],arr[i]);
            count=Math.max(count,currentSum);
        }
        System.out.println(count);
    }
}
