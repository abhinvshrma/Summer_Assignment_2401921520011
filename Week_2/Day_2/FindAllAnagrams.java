package Week_2.Day_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAnagrams {
        public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        int ns = s.length();
        int np = p.length();
        
        if (np > ns) return result;
        
        int[] pCount = new int[26];
        int[] sWindow = new int[26];
        for (int i = 0; i < np; i++) {
            pCount[p.charAt(i) - 'a']++;
            sWindow[s.charAt(i) - 'a']++;
        }
        if (Arrays.equals(pCount, sWindow)) {
            result.add(0);
        }
        for (int i = np; i < ns; i++) {

            sWindow[s.charAt(i) - 'a']++;
            
            sWindow[s.charAt(i - np) - 'a']--;
            if (Arrays.equals(pCount, sWindow)) {
                int windowStartIndex = i - np + 1;
                result.add(windowStartIndex);
            }
        }
        
        return result;
    }
}
