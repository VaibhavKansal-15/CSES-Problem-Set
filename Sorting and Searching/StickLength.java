import java.io.*;
import java.util.*;
public class StickLength {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int[] arr=new int[n];
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }  
        Arrays.sort(arr); 
        long median=arr[n/2];
        long count=0;
        for(int i=0;i<n;i++){
            count+=Math.abs(arr[i]-median);
        }
        System.out.println(count);
    }
}
