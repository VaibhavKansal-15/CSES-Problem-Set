import java.util.*;
public class ChessBoardAndQueens {
    static int count=0;
    private static void placeQueens(int row,char[][] arr,boolean[] cols,boolean[] diag1,boolean[] diag2){
        if(row==8){
            count++;
            return;
        }
        for(int col=0;col<8;col++){
            if(arr[row][col]=='.' && !cols[col] && !diag1[row-col+7] && !diag2[row+col]){
                cols[col]=diag1[row-col+7]=diag2[row+col]=true;

                placeQueens(row+1, arr, cols, diag1, diag2);
                cols[col]=diag1[row-col+7]=diag2[row+col]=false;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char[][] arr=new char[8][8];
        for(int i=0;i<8;i++){
            arr[i]=sc.next().toCharArray();
        }
        sc.close();
        placeQueens(0,arr,new boolean[8],new boolean[15],new boolean[15]);
        System.out.println(count);
    }
}
