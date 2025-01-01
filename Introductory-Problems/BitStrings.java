import java.util.*;
public class BitStrings {
    static final int MOD=1000000007;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Long n=sc.nextLong();
        sc.close();        
        long result=modularExp(2,n,MOD);
        System.out.println(result);
    }

    private static long modularExp(long base,long exp,int mod){
        long result=1;
        base=base%mod;  // Ensure base is within the modulo range
        while(exp>0){
            // If exp is odd, multiply base with result
            if((exp&1)==1){
                result=(result*base)%mod;
            }
            // Square the base and halve the exponent
            base=(base*base)%mod;
            exp>>=1;  // Equivalent to exp = exp / 2
        }
        return result;
    }
}
