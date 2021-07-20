import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'getTotalX' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static boolean isMultiple(List<Integer> a, int f) {
        for(int i : a) {
            if(f % i != 0) {
                return false;
            }
        } 
        return true;   
    }
    
    public static boolean isFactor(List<Integer> a, int f) {
        for(int i : a) {
            if(i % f != 0) {
                return false;
            }
        } 
        return true;   
    }
    
    public static int getTotalX(List<Integer> a, List<Integer> b) {
    // Write your code here
        int count = 0;
        Collections.sort(a);
        Collections.sort(b);
        //Get the HCF
        int factor = b.get(0);
        List<Integer> factors = new ArrayList<Integer>();
        for(int i = 1 ; i <= factor; i++) {
            if(factor % i == 0)
                factors.add(i);
        }
        List<Integer> common = new ArrayList<Integer>();
        for(int f : factors) {
            if(isMultiple(a, f) && isFactor(b, f)) {
                common.add(f);
            }
        }
    return common.size() ; 
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        String[] brrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> brr = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            int brrItem = Integer.parseInt(brrTemp[i]);
            brr.add(brrItem);
        }

        int total = Result.getTotalX(arr, brr);

        bufferedWriter.write(String.valueOf(total));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
