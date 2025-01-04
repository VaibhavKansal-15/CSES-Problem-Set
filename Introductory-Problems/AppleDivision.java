import java.util.*;
public class AppleDivision {
    private static long findMinDifference(int index,long group1,long group2,long[] arr){
        if(index==arr.length){
            return Math.abs(group1-group2);
        }
        long diff1=findMinDifference(index+1, group1+arr[index], group2, arr);
        long diff2=findMinDifference(index+1, group1, group2+arr[index], arr);
        return Math.min(diff1,diff2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long[] arr=new long[(int)n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextLong();
        }
        sc.close();
        long minDifference=findMinDifference(0,0,0,arr);
        System.out.println(minDifference);
    }
}
