//package SortingandSearching;

import java.util.*;
import java.io.*;

public class SumofTwoValues {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int x=Integer.parseInt(st.nextToken());
        int[] arr=new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            int result=x-arr[i];
            if(map.containsKey(result)){
                int idx1=map.get(result)+1;
                int idx2=i+1;
                if(idx1<idx2){
                    System.out.println(idx1+" "+idx2);
                }else{
                    System.out.println(idx2+" "+idx1);
                }
                return;
            }
            map.put(arr[i],i);
        }
        System.out.println("IMPOSSIBLE");
    }
}
