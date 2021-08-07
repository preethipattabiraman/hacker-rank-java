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

public class Solution {

    static boolean isAvailable(List<Integer> operations, int z) {
        Map<Integer, Integer> counts = new HashMap<Integer, Integer>();
        for(int i : operations) {
            if(counts.containsKey(i)) {
                counts.put(i, counts.get(i) + 1);
            }
            else {
                counts.put(i, 1);
            }
        }
        for(Map.Entry<Integer, Integer> map : counts.entrySet()) {
            if(map.getValue() == z) {
                return true;
            }
        }
        return false;
    }
    
    // Complete the freqQuery function below.
    static List<Integer> freqQuery(List<List<Integer>> queries) {
        List<Integer> query = new ArrayList<Integer>();
        List<Integer> operations = new ArrayList<Integer>();
        for(List<Integer> item : queries) {
            switch(item.get(0)) {
                case 1:
                    operations.add(item.get(1));
                    break;
                case 2:
                    if(operations.contains(item.get(1))) {
                        operations.remove(item.get(1));
                    }
                    break;
                case 3:
                      if(isAvailable(operations, item.get(1))) {
                          query.add(1);
                      }
                      else {
                          query.add(0);
                      }  
                      break;
            }            
        }
        
        return query;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> queries = new ArrayList<>();

        IntStream.range(0, q).forEach(i -> {
            try {
                queries.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        List<Integer> ans = freqQuery(queries);

        bufferedWriter.write(
            ans.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
