package SortingandSearching;
import java.io.*;
import java.util.*;

public class Apartments {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long n = Long.parseLong(st.nextToken());
        long m = Long.parseLong(st.nextToken());
        long k = Long.parseLong(st.nextToken());
        long[] applicants = new long[(int) n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            applicants[i] = Long.parseLong(st.nextToken());
        }
        long[] apartments = new long[(int) m];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            apartments[i] = Long.parseLong(st.nextToken());
        }
        if (m == 1) {
            int count = 1;
            System.out.println(count);
        } else {
            long answer = findMatch(n, m, k, applicants, apartments);
            System.out.println(answer);
        }
    }
    private static long findMatch(long n, long m, long k, long[] applicants, long[] apartments) {
        Arrays.sort(applicants);
        Arrays.sort(apartments);
        int i = 0; 
        int j = 0;
        int count = 0;
        while (i < n && j < m) {
            if (applicants[i] <= apartments[j] + k && applicants[i] >= apartments[j] - k) {
                count++;
                i++;
                j++;
            } else if (applicants[i] < apartments[j]) {
                i++;
            } else {
                j++;
            }
        }
        return count;
    }
}
