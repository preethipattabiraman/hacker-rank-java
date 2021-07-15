import java.util.Scanner;

public class Lexicographical {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        String currentString = s.substring(0,k);
        smallest = currentString;
        largest = currentString;
        
        for (int i = k; i < s.length(); i++) {
            currentString = currentString.substring(1, k) + s.charAt(i);
            if (largest.compareTo(currentString) < 0)    
                 largest = currentString;
            if (smallest.compareTo(currentString) > 0)
                 smallest = currentString;           
        }

        return smallest + "\n" + largest;
    }

