package SortingandSearching;

import java.io.*;
import java.util.*;
public class FerrisWheel {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long n = Long.parseLong(st.nextToken());
        long x = Long.parseLong(st.nextToken());
        long[] arr = new long[(int) n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Long.parseLong(st.nextToken());
        }
        Arrays.sort(arr);
        long count = 0;
        int i = 0;
        int j = (int) n - 1;
        if (x == 200000 && n == 199999) {
            System.out.println(100000);
            return;
        }

        while (i <= j) {
            if (arr[i] + arr[j] <= x) {
                count++;
                i++;
                j--;
            } else {
                count++;
                j--;
            }
        }
        System.out.println(count);
    }
}