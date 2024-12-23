import java.util.*;
public class MissingNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Long n=sc.nextLong();
        long sum=0;
        Long[] arr=new Long[(int)(n-1)];
        for(int i=0;i<n-1;i++){
            arr[i]=sc.nextLong();
            sum+=arr[i];
        }
        long ans=(n*(n+1))/2;
        System.out.println(ans-sum);
        sc.close();
    }
}
