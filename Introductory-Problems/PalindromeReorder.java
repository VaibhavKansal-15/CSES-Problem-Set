import java.util.*;

public class PalindromeReorder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        sc.close();
        //StringBuilder str=new StringBuilder(s.length());
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            map.put(c,map.getOrDefault(c, 0)+1);
        }
        StringBuilder left=new StringBuilder();
        StringBuilder middle=new StringBuilder();
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            char c=entry.getKey();
            int count=entry.getValue();
            // If count is odd, place one character in the middle
            if(count%2!=0){
                if(middle.length()>0){
                    System.out.println("NO SOLUTION");
                    return;
                }
                middle.append(c);
            }
            // Add half of the even counts to the left half of the palindrome
            for(int i=0;i<count/2;i++){
                left.append(c);
            }
        }
        // Form the full palindrome by reversing the left half and appending it to the middle
        StringBuilder palindrome=new StringBuilder(left);
        palindrome.append(middle);
        palindrome.append(left.reverse());
        System.out.println(palindrome.toString());
    }
}
