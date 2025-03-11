import java.util.*;

public class IncreasingArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long[] arr=new long[(int)n]; 
        for(int i=0;i<n;i++){
            arr[i]=sc.nextLong();
        }
        long count=0;
        for(int i=1;i<n;i++){
            if(arr[i]<arr[i-1]){
                count+=arr[i-1]-arr[i];
                arr[i]=arr[i-1];
            }
        }
        System.out.println(count);
        sc.close();
    }
}
