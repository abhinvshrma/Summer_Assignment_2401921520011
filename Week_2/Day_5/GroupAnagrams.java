package Week_2.Day_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        
        for (int i = 0; i < strs.length; i++) {
            String curr = strs[i];
            
            char[] chars = curr.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            
            map.get(key).add(curr);
        }
        
        return new ArrayList<>(map.values());
    }
}
