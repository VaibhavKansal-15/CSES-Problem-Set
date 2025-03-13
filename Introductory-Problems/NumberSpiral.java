import java.io.*;

public class NumberSpiral {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));        
        int t = Integer.parseInt(br.readLine());
        StringBuilder output = new StringBuilder();
        while (t-- > 0) {
            String[] inputs = br.readLine().split(" ");
            long row = Long.parseLong(inputs[0]);
            long col = Long.parseLong(inputs[1]);
            long d = Math.max(row, col); 
            long base = (d - 1) * (d - 1); 
            long result; 
            if (d % 2 == 0) {
                // Even diagonal
                result = base + col + (d - row);
            } else {
                // Odd diagonal
                result = base + row + (d - col);
            }
            output.append(result).append("\n");
        } 
        bw.write(output.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
