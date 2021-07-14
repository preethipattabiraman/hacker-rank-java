import java.io.*;
import java.util.*;

public class SplitString {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        String[] split = s.split("['!?,._@ ]+");
        System.out.println(split.length);
        for(String a: split) {
            System.out.println(a);
        }
        scan.close();
    }
}

