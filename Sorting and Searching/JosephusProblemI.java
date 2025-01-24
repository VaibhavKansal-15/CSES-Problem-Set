import java.io.*;

public class JosephusProblemI {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        // Create an array to represent the people
        int[] order = new int[n];
        for (int i = 0; i < n; i++) {
            order[i] = i + 1;
        }
        
        StringBuilder result = new StringBuilder();
        int index = 0;
        int remaining = n;

        while (remaining > 0) {
            // Calculate the next position to eliminate (Josephus formula)
            index = (index + 1) % remaining;
            result.append(order[index]).append(" ");
            
            // Shift elements left to simulate removal
            for (int i = index; i < remaining - 1; i++) {
                order[i] = order[i + 1];
            }
            remaining--; // Decrease the size of the array
        }
        
        // Print the final result
        System.out.println(result.toString().trim());
    }
}
