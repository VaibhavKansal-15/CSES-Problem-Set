import java.util.*;
import java.io.*;

public class MissingCoinSum{
  public static void main(String[] args) throws IOException{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st=new StringTokenizer(br.readLine());
    int n=Integer.parseInt(st.nextToken());
    long[] arr=new long[n];
    st=new StringTokenizer(br.readLine());
    for(int i=0;i<n;i++){
      arr[i]=Integer.parseInt(st.nextToken());
    }
    Arrays.sort(arr);
    long target=1;
    for(long coin:arr){
      if(coin>target){
        break;
      }
      target+=coin;
    } 
    System.out.println(target);
  }
}
