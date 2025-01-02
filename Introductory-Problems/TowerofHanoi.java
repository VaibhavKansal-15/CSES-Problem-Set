import java.util.Scanner;

public class TowerofHanoi{
    public static void answer(long n, String source, String helper, String target) {
        if(n==1){
            System.out.println(source + " " + target);
            return;
        }
        answer(n - 1, source, target, helper);
        System.out.println(source + " " + target);
        answer(n - 1, helper, source, target);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        sc.close();
        long moves=(1L<<n)-1;//2^n-1 minimum number of moves
        System.out.println(moves);
        answer(n,"1","2","3");
    }
}