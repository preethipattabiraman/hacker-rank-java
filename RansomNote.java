import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'checkMagazine' function below.
     *
     * The function accepts following parameters:
     *  1. STRING_ARRAY magazine
     *  2. STRING_ARRAY note
     */

    public static void checkMagazine(List<String> magazine, List<String> note) {
    // Write your code here
    
    if(note.size() > magazine.size()) {
        System.out.println("No");
        return;
    }
        HashMap<String, Integer> magazineHash = new HashMap<String, Integer>();
        HashMap<String, Integer> noteHash = new HashMap<String, Integer>();
        
        for(String m : magazine) {
            if(!magazineHash.containsKey(m)) {
                magazineHash.put(m,0);
            }
            magazineHash.put(m, magazineHash.get(m) + 1);
        }
        
        for(String n : note) {
            if(!noteHash.containsKey(n)) {
                noteHash.put(n,0);
            }
            noteHash.put(n, noteHash.get(n) + 1);
        }
        
        for(Map.Entry<String, Integer> n : noteHash.entrySet()) {
            if(magazineHash.containsKey(n.getKey()) && (n.getValue() == magazineHash.get(n.getKey()))) {
                continue;
            }
            else {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int m = Integer.parseInt(firstMultipleInput[0]);

        int n = Integer.parseInt(firstMultipleInput[1]);

        List<String> magazine = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .collect(toList());

        List<String> note = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .collect(toList());

        Result.checkMagazine(magazine, note);

        bufferedReader.close();
    }
}
