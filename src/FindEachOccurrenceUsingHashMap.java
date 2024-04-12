import java.util.HashMap;
import java.util.Map;

public class FindEachOccurrenceUsingHashMap {

    public static void main(String[] args) {
        String str = "aabbbccddd";

        Map<Character,Integer> map = new HashMap<>();

        char[] chars = str.toCharArray();

        for(char ch : chars){
            if(!map.containsKey(ch)){
                map.put(ch,1);
            }
            else {
                int value = map.get(ch);
                map.put(ch,value+1);
            }
        }
        map.forEach((key,value)-> System.out.print(key+""+value));
    }
}
