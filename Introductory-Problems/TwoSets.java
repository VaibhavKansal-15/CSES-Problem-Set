import java.util.*;

public class TwoSets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long totalSum = n * (n + 1) / 2;
        if (totalSum % 2 != 0) {
            System.out.println("NO");
        } else {
            System.out.println("YES");

            long targetSum = totalSum / 2;

            StringBuilder set1 = new StringBuilder();
            StringBuilder set2 = new StringBuilder();
            int set1Count = 0, set2Count = 0;
            for (long i = n; i >= 1; i--) {
                if (targetSum >= i) {
                    set1.append(i).append(" ");
                    targetSum -= i;
                    set1Count++;
                } else {
                    set2.append(i).append(" ");
                    set2Count++;
                }
            }
            System.out.println(set1Count);
            System.out.println(set1);
            System.out.println(set2Count);
            System.out.println(set2);
        }

        sc.close();
    }
}
