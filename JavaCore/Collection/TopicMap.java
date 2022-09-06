package Collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * 2)	(Map)Given a string, output duplicate characters and their counts
 */
public class TopicMap {
    
    /**
     * Return duplicate counts.
     * @param str
     * @return List
     */
    public static List<Character> countDuplicate(String str) {
        Map<Character, Integer> mp = new HashMap<>();
        for(int i=0; i<str.length(); i++){
            Character c = str.charAt(i);
            if(mp.get(c) == null)
                mp.put(c, 1);
            else
                mp.put(c, mp.get(c)+1);
        }

        List<Character> result = new ArrayList<>();
        Iterator<Map.Entry<Character,Integer>> it = mp.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<Character, Integer> entry = it.next();
            if(entry.getValue() > 1)
                result.add(entry.getKey());
        }
        return result;
    }

    public static void main(String[] args) {
        List<Character> result = new ArrayList<>();
        result = countDuplicate("aabbcccdedfg");
        System.out.println(result);
    }
}
