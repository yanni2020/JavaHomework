package Java8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


/**
 * 4)	"Eclipse eclipse Eclipse eclipse amc clip ECLIPSE" – count the 
 *      occurrence of each unique word (ignore case), return result as a map. 
 *      For example (eclipse->5, amc->1, clip->1) 
 */
public class Count {
    public static void main(String[] args) {
        Map<String, Integer> mp = new HashMap<>();
        String str = "Eclipse eclipse Eclipse eclipse amc clip ECLIPSE";

        Arrays.asList(str.split(" "))
              .stream()
              .flatMap(w -> Arrays.stream(w.split(" ")))
              .forEach(w -> {
                if(mp.containsKey(w)){
                    int count = mp.get(w)+1;
                    mp.put(w, count);
                }
                else{
                    mp.put(w, 1);
                }
              });

        System.out.println(mp);
    }
}
