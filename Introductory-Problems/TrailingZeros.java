import java.util.Scanner;

public class TrailingZeros {
    public static long countTrailingZeros(long n) {
        long count = 0;
        while (n >= 5) {
            count += n / 5;
            n /= 5;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(countTrailingZeros(n));
        sc.close();
    }
}
