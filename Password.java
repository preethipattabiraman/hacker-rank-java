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
     * Complete the 'minimumNumber' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. STRING password
     */

    public static int minimumNumber(int n, String password) {
    // Return the minimum number of characters to make the password strong
    if(password.length() < 6) {
        return 6 - password.length();
    }
    else {
        int num = 0;
        Pattern smallCase = Pattern.compile("[a-z]");
        Pattern capitalCase = Pattern.compile("[A-Z]");
        Pattern digit = Pattern.compile("[0-9]");
        Pattern special = Pattern.compile ("[!@#$%^&*()-+]");

        Matcher hasSmallLetter = smallCase.matcher(password);
        Matcher hasCapitalLetter = capitalCase.matcher(password);
        Matcher hasDigit = digit.matcher(password);
        Matcher hasSpecial = special.matcher(password);
        
        if(!hasSmallLetter.find()) { 
            num++;
        }   
        if(!hasCapitalLetter.find()) {
            num++;
        }
        if(!hasDigit.find()) {
            num++;
        }
        if(!hasSpecial.find()) {
            num++;
        }
    return num;
           
    }
    
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String password = bufferedReader.readLine();

        int answer = Result.minimumNumber(n, password);

        bufferedWriter.write(String.valueOf(answer));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
