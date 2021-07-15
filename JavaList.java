import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        List<Integer> L = new ArrayList<Integer>();
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        for(int i = 0; i < N; i++) {
            L.add(s.nextInt());
        }
        int Q = s.nextInt();
        while(Q > 0) {
            String cmd = s.next();
            if(cmd.equalsIgnoreCase("Insert")) {
                int index = s.nextInt();
                int value = s.nextInt();
                L.add(index, value);
            }
            if(cmd.equalsIgnoreCase("Delete")) {
                int index = s.nextInt();
                L.remove(index);
            }
            Q--;
        }
        for(int l : L){
            System.out.print(l + " ");
        }
        
    }
}
