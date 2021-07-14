import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            printSeries(a,b,n);
        }
        in.close();
    }
    
    public static void printSeries(int a, int b, int n) {
        for(int i = 0; i < n; i++) {
            int s = a + b;
            int temp = s;
            for(int j = 1; j <= i ; j++) {
                temp += (Math.pow(2,j) * b);
            }
        System.out.print(temp + " ");
        }
        System.out.println();
    }
}
