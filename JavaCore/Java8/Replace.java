package Java8;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * 3)	"walabcwalexywalxzsfwalmx”  -- replace "wal" with "sams"
 */
public class Replace {
    public static void main(String[] args) {
        String str = "walabcwalexywalxzsfwalmx";
        String ss = Arrays.asList(str.split("(?i)wal")).stream()
                                                  .collect(Collectors
                                                  .joining("sams"));
        System.out.println(ss);
    }
}
