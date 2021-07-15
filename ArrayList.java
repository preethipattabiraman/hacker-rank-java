import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        ArrayList<ArrayList<Integer>> array = new ArrayList<ArrayList<Integer>>();
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        for(int i = 0; i < n; i++) {
            int size = s.nextInt();
            ArrayList<Integer> list = new ArrayList<Integer>();
            for(int j = 0; j < size ; j++) {
                list.add(s.nextInt());
            }
            array.add(list);
        }
        
        int q = s.nextInt();
        for(int i = 0; i < q; i++) {
            int x = s.nextInt();
            int y = s.nextInt();
            ArrayList<Integer> needed = (ArrayList<Integer>) array.get(x-1);
            if(y >= 0 && y <= needed.size()) {
                System.out.println(needed.get(y-1));
            }
            else {
                System.out.println("ERROR!");
            }
        }
        
    }
}
