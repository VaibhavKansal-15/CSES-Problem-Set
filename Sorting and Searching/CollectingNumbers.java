import java.util.*;

public class CollectingNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int[] arr = new int[n];
        int[] pos = new int[n + 1];
      
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            pos[arr[i]] = i;
        }
        int rounds = 1;
        for (int i = 2; i <= n; i++) {
            if (pos[i] < pos[i - 1]) {
                rounds++;
            }
        }        
        System.out.println(rounds);
        sc.close();
    }
}
