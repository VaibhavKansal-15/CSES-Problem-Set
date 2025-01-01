import java.util.Scanner;
public class TwoKnights {
    private static long valid(int i){
        long totalWays=(long) i*i*(i*i-1)/2;

        long invalidWays=0;
        if(i>2){
            invalidWays=4*(i-2)*(i-1);
        }
        return totalWays-invalidWays;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        for(int i=1;i<=n;i++){
            System.out.println(valid(i));
        }
        sc.close();
    }
}
