import java.util.*;

public class DigitQueries{
    public static int infinteString(long k) {
        int count = 0;
        if (k <= 9) {
            count += k;
            return count;
        } else {
            long length = 1; // Current digit length (1 for "1-9", 2 for "10-99", etc.)
            long numCount = 9; // Count of numbers with the current digit length
            long start = 1; // Starting number for the current digit length

            // Find the range where the k-th digit lies
            while (k > length * numCount) {
                k -= length * numCount;
                length++;
                numCount *= 10;
                start *= 10;
            }

            // Find the specific number containing the k-th digit
            long number = start + (k - 1) / length;
            int digitIndex = (int) ((k - 1) % length);

            // Return the specific digit in the number
            return String.valueOf(number).charAt(digitIndex) - '0';
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long q = sc.nextLong();
        while (q-- > 0) { // Fix loop condition
            long k = sc.nextLong();
            int result = infinteString(k);
            System.out.println(result);
        }
        sc.close();
    }
}
