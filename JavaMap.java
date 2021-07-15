//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
	public static void main(String []argh)
	{
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		in.nextLine();
        HashMap<String, Integer> phone = new HashMap<String, Integer>();
		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
			Integer phoneNumber=in.nextInt();
			in.nextLine();
            phone.put(name, phoneNumber);
		}
		while(in.hasNext())
		{
			String s=in.nextLine();
            if(phone.containsKey(s)) {
                System.out.println(s+"="+phone.get(s));
            }
            else {
                System.out.println("Not found");
            }
		}
	}
}



