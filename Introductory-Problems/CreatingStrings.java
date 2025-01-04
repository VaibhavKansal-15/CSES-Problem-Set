import java.util.*;

public class CreatingStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char[] chars = s.toCharArray();// Convert string to character array and sort it
        Arrays.sort(chars);
        List<String> permutations = new ArrayList<>();// List to store permutations
        permutations.add(new String(chars));
        int count = 1;
        // Generate all permutations using next permutation logic
        while (nextPermutation(chars)) {
            count++;
            permutations.add(new String(chars));
        }
        // Print the count and permutations
        System.out.println(count);
        for (String perm : permutations) {
            System.out.println(perm);
        }
        scanner.close();
    }
    // Helper method to generate the next lexicographical permutation
    private static boolean nextPermutation(char[] chars) {
        int n = chars.length;
        int i = n - 2;
        // Find the first character that is smaller than the one next to it
        while (i >= 0 && chars[i] >= chars[i + 1]) {
            i--;
        }
        // If no such character is found, we are at the last permutation
        if (i < 0) {
            return false;
        }
        // Find the smallest character on the right of 'i' that is larger than chars[i]
        int j = n - 1;
        while (chars[j] <= chars[i]) {
            j--;
        }
        // Swap the two characters
        swap(chars, i, j);
        // Reverse the characters to the right of 'i'
        reverse(chars, i + 1, n - 1);
        return true;
    }
    // Helper method to swap two characters in an array
    private static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
    // Helper method to reverse a part of the array
    private static void reverse(char[] chars, int start, int end) {
        while (start < end) {
            swap(chars, start, end);
            start++;
            end--;
        }
    }
}