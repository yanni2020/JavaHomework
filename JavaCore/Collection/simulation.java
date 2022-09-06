package Collection;

import java.util.Iterator;
import java.util.Map;

/**
 * 3)	Use a map to simulate database table, key should be the primary key 
 *      (assume only one column), value is the record, your simulation should 
 *      include CRUD operation methods
 */
public class simulation {
    
    private static Map<String, String> record;

    /**
     * create a new entry
     * @param key
     * @param value
     */
    public static void create(String key, String value){
        if(record.get(key) == null)
            record.put(key, value);
        else
            System.out.println("record exist!");
    }
    
    /**
     * Read all record;
     */
    public static void readAll() {
        Iterator<Map.Entry<String, String>> it = record.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<String, String> entry = it.next();
            System.out.printf("%s, %s", entry.getKey(), entry.getValue());
        }
    }

    /**
     * read specific entry according to the key.
     * @param key
     * @return string
     */
    public static String read(String key) {
        return record.get(key);
    }

    /**
     * update value
     * @param key
     * @param value
     */
    public static void update(String key, String value) {
        if(record.get(key) != null)
            record.put(key, value);
        else
            System.out.println("record does not exist");
    }

    /**
     * delete an entry.
     * @param key
     */
    public static void delete(String key) {
        if(record.get(key) != null)
            record.remove(key);
        else
            System.out.println("record does not exist");
    }

}
