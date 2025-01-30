import java.util.Scanner;

public class MakeDivisibleBy25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String n = sc.next();
            int minRemovals = Integer.MAX_VALUE;
            minRemovals = Math.min(minRemovals, findRemovals(n, '0', '0')); // Find "00"
            minRemovals = Math.min(minRemovals, findRemovals(n, '2', '5')); // Find "25"
            minRemovals = Math.min(minRemovals, findRemovals(n, '5', '0')); // Find "50"
            minRemovals = Math.min(minRemovals, findRemovals(n, '7', '5')); // Find "75"
            System.out.println(minRemovals);
        }
        sc.close();
    }
    private static int findRemovals(String n, char first, char second) {
        int secondIndex = -1, firstIndex = -1;
        for (int i = n.length() - 1; i >= 0; i--) {
            if (secondIndex == -1 && n.charAt(i) == second) {
                secondIndex = i;
            } else if (secondIndex != -1 && n.charAt(i) == first) {
                firstIndex = i;
                break;
            }
        }
        return (firstIndex == -1 || secondIndex == -1) ? Integer.MAX_VALUE : (n.length() - firstIndex - 2);
    }
}