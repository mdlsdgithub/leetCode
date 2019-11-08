import java.util.HashMap;
import java.util.Map;

public class leetcode242 {
    public boolean isAnagram(String s, String t) {
        char[] charArray1 = s.toCharArray();
        char[] charArray2 = t.toCharArray();
        Map<Character,Integer> map1 = new HashMap();
        Map<Character,Integer> map2 = new HashMap();
        for (int i = 0; i < charArray1.length; i++) {
            if(map1.containsKey(charArray1[i])){
                map1.put(charArray1[i],map1.get(charArray1[i])+1);
            }else{
                map1.put(charArray1[i],0);
            }
        }
        for (int i = 0; i < charArray2.length; i++) {
            if(map2.containsKey(charArray2[i])){
                map2.put(charArray2[i],map2.get(charArray2[i])+1);
            }else{
                map2.put(charArray2[i],0);
            }
        }
        if(map1.equals(map2)){
            return true;
        }else {
            return false;
        }
    }
}
