import java.util.*;

public class GrayCode {
    public static List<String> generateGrayCode(int n) {
        List<String> grayCode = new ArrayList<>();
        grayCode.add("0");
        grayCode.add("1");

        // Iteratively build the Gray code sequence for n bits
        for (int i = 2; i <= n; i++) {
            int size = grayCode.size();
            // Add reversed Gray code with `1` prefixed
            for (int j = size - 1; j >= 0; j--) {
                grayCode.add("1" + grayCode.get(j));
            }
            // Prefix existing Gray code with `0`
            for (int j = 0; j < size; j++) {
                grayCode.set(j, "0" + grayCode.get(j));
            }
        }

        return grayCode; // Return the generated Gray code list
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Use int instead of Long for n
        sc.close();

        List<String> grayCode = generateGrayCode(n);
        for (String code : grayCode) {
            System.out.println(code);
        }
    }
}
