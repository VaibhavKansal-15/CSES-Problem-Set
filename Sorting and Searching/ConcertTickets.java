import java.io.*;
import java.util.*;

public class ConcertTickets {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        TreeMap<Integer, Integer> concert_map = new TreeMap<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int price = Integer.parseInt(st.nextToken());
            concert_map.put(price, concert_map.getOrDefault(price, 0) + 1);
        }
        StringBuilder res = new StringBuilder();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            int maxPrice = Integer.parseInt(st.nextToken());
            Map.Entry<Integer, Integer> val = concert_map.floorEntry(maxPrice);
            if (val != null) {
                res.append(val.getKey()).append("\n");
                if (val.getValue() == 1) {
                    concert_map.remove(val.getKey());
                } else {
                    concert_map.put(val.getKey(), val.getValue() - 1);
                }
            } else {
                res.append("-1\n");
            }
        }
        System.out.print(res);
    }
}
