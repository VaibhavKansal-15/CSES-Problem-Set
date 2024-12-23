import java.util.*;
public class Repetitions {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        long count=1;
        long ans=1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                count++;
            }else{
                count=1;
            }
            ans=Math.max(ans,count);
        }
        System.out.println(ans);

        sc.close();
    }
}
