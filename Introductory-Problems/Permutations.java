import java.util.*;

public class Permutations {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        if (n == 1) {
            System.out.println(1);
        } else if (n <= 3) {
            System.out.println("NO SOLUTION");
        }else{
            StringBuilder result=new StringBuilder();
            for(long i=2;i<=n;i+=2){
                result.append(i).append(" ");
            }
            for(long i=1;i<=n;i+=2){
                result.append(i).append(" ");
            }
            System.out.println(result.toString().trim());
        }    
        sc.close();
    }    
}
