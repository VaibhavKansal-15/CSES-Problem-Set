import java.io.*;

public class JosephusProblemI {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] order = new int[n];
        for (int i = 0; i < n; i++) {
            order[i] = i + 1;
        }
        StringBuilder result = new StringBuilder();
        int index = 0;
        int remaining = n;
        while (remaining > 0) {
            index = (index + 1) % remaining;
            result.append(order[index]).append(" ");            
            for (int i = index; i < remaining - 1; i++) {
                order[i] = order[i + 1];
            }
            remaining--;
        }
        System.out.println(result.toString().trim());
    }
}
