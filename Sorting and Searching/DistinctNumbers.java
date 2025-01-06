import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashSet;

public class DistinctNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();
        long n = Long.parseLong(br.readLine());
        HashSet<Long> set = new HashSet<>();
        String[] numbers = br.readLine().split(" ");
        for (String number : numbers) {
            set.add(Long.parseLong(number));
        }
        str.append(set.size());
        System.out.println(str.toString());
    }
}
