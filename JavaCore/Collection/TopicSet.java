package Collection;

import java.util.*;

/**
 * 1)	(Set)Find true friends: Given two arraylists containing friend names, 
 *      find the true friends that appear in both list.
 */
public class TopicSet {

    /**
     * Get unique value of two lists.
     * @param l1
     * @param l2
     * @return a set of String
     */
    public static Set<String> trueFriend(List<String> l1, List<String>l2){
        Set<String> result = new HashSet<>();
        for(String s: l1){
            result.add(s);
        }
        for(String s: l2){
            result.add(s);
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> l1 = new ArrayList<>();
        List<String> l2 = new ArrayList<>();

        l1.add("a");
        l1.add("b");
        l2.add("b");
        l2.add("c");
        Set<String> list = trueFriend(l1, l2);
        for(String s: list){
            System.out.print(s + " ");
        }
        System.out.println();

    }
    
}
