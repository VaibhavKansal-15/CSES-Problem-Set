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

// below code is working in cses website for all 11 test case and above one will for 10 only test case that is running has 2 lakh test cases 
// import java.io.DataInputStream;
// import java.io.IOException;
// import java.util.Map;
// import java.util.TreeMap;

// public class Main {
//     static class Reader
//     {
//         final private int BUFFER_SIZE = 1 << 16;
//         private DataInputStream din;
//         private byte[] buffer;
//         private int bufferPointer, bytesRead;

//         public Reader()
//         {
//             din = new DataInputStream(System.in);
//             buffer = new byte[BUFFER_SIZE];
//             bufferPointer = bytesRead = 0;
//         }
//         private void fillBuffer() throws IOException
//         {
//             bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
//             if (bytesRead == -1)
//                 buffer[0] = -1;
//         }

//         private byte read() throws IOException
//         {
//             if (bufferPointer == bytesRead)
//                 fillBuffer();
//             return buffer[bufferPointer++];
//         }

//         public void close() throws IOException
//         {
//             if (din == null)
//                 return;
//             din.close();
//         }
//         public int nextInt() throws IOException
//         {
//             int ret = 0;
//             byte c = read();
//             while (c <= ' ')
//                 c = read();
//             boolean neg = (c == '-');
//             if (neg)
//                 c = read();
//             do
//             {
//                 ret = ret * 10 + c - '0';
//             }  while ((c = read()) >= '0' && c <= '9');

//             if (neg)
//                 return -ret;
//             return ret;
//         }
//     }
//     public static void main(String[] args) throws IOException {
//         Reader br = new Reader();

//         int n = br.nextInt();
//         int m = br.nextInt();
//         TreeMap<Integer, Integer> concert_map= new TreeMap<>();
//         StringBuffer res = new StringBuffer();
//         Integer temp;
//         Map.Entry<Integer, Integer> val;

//         for (int i = 0; i < n; i++) {
//             temp = br.nextInt();
//             if (concert_map.containsKey(temp))
//                 concert_map.put(temp,concert_map.get(temp)+1);
//             else concert_map.put(temp,1);
//         }
//         for (int i = 0; i < m; i++) {
//             temp = br.nextInt();
//             val=concert_map.lowerEntry(temp+1);
//             if (val!=null){
//                 res.append(val.getKey()).append('\n');
//                 if (val.getValue() == 1)
//                     concert_map.remove(val.getKey());
//                 else
//                     concert_map.put(val.getKey(),val.getValue()-1);
//             }else
//                 res.append("-1\n");
//         }

//         System.out.println(res);
//     }
// }