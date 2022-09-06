package String;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * Topic: String
 */
public class TopicString {

    /**
     * 1) Given string “Algorithms”, return  “go” and “Algo” using substring
     * @param str
     * @return result[],  “go” and “Algo”
     */
    public static String[] algorithms(String str){
        String[] result = new String[2];
        result[0] = str.substring(2, 4);
        result[1] = str.substring(0, 4);
        return result;
    }


    /**
     * 2) Given two strings, compare if these two two strings are equal by 
     *    comparing each character 
     * @param str1
     * @param str2
     * @return boolean value
     */
    public static boolean ifEqualString(String str1, String str2) {
        if(str1.length() != str2.length())
            return false;
        for(int i=0; i<str1.length(); i++){
            if(str1.charAt(i) != str2.charAt(i))
                return false;
        }
        return true;
    }

    /**
     * 3) Given string “https://www.amazon.com/demo?test=abc”, return [“https”,
     *    ”www”,”amazon”,”com”,”demo”,”test”,”abc”] 
     * @param str
     * @return result, an ArrayList contains split String.
     */
    public static List<String> strTokenlizer(String str) {
        List<String> result = new ArrayList<String>();
        StringTokenizer sToken = new StringTokenizer(str,":/.?=");
        while(sToken.hasMoreTokens()){
            result.add(sToken.nextToken());
        }
        return result;
    }

    /**
     * 4) Given a list of string array, combine them into one string sentence, 
     *    return the string sentence
     * @param list
     * @return result, combined string
     */
    public static String combineStr(List<String> list) {
        String result = new String();
        for(String s: list)
            result += s;
        return result;
    }


    public static void main(String[] args) {
        // Problem(1)
        System.out.print("Problem(1): ");
        System.out.print(algorithms("Algorithms")[0]+" | ");
        System.out.println(algorithms("Algorithms")[1]);

        // Problem(2)
        System.out.print("Problem(2): ");
        System.out.print(ifEqualString("str1", "str2")+" | ");
        System.out.println(ifEqualString("str1str2", "str1str2"));

        // Problem(3)
        System.out.print("Problem(3): ");
        for(String s: strTokenlizer("https://www.amazon.com/demo?test=abc"))
            System.out.print(s+" ");
        System.out.println();

        // Problem(4)
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        System.out.print("Problem(4): ");
        System.out.println(combineStr(list));
    }
}