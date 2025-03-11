// import java.util.Scanner;
// public class CoinPiles {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         long t = sc.nextLong(); // Read the number of test cases
//         while (t-- > 0) {
//             long a = sc.nextLong(); // Read the first pile size
//             long b = sc.nextLong(); // Read the second pile size
//             // Ensure a is always the smaller pile
//             if (a > b) {
//                 long temp = a;
//                 a = b;
//                 b = temp;
//             }
//             // Check the conditions for a valid solution
//             if (b > a * 2 || (a + b) % 3 != 0) {
//                 System.out.println("NO");
//             } else {
//                 System.out.println("YES");
//             }
//         }
//         sc.close();
//     }
// }
//Optimised code

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CoinPiles {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder output = new StringBuilder();
        int t = Integer.parseInt(br.readLine()); // Number of test cases
        for (int i = 0; i < t; i++) {
            String[] input = br.readLine().split(" ");
            long a = Long.parseLong(input[0]);
            long b = Long.parseLong(input[1]);
            // Ensure a is the smaller pile
            if (a > b) {
                long temp = a;
                a = b;
                b = temp;
            }
            // Check conditions
            if (b > a * 2 || (a + b) % 3 != 0) {
                output.append("NO\n");
            } else {
                output.append("YES\n");
            }
        }
        // Print all results at once
        System.out.print(output.toString());
    }
}
