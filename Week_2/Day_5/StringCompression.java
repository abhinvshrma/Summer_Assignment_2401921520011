package Week_2.Day_5;

public class StringCompression {
    public int compress(char[] chars) {
        int idx = 0;
        int i = 0;
        
        while (i < chars.length) {
            char curr = chars[i];
            int count = 0;
            
            while (i < chars.length && chars[i] == curr) {
                count++;
                i++;
            }
            
            chars[idx] = curr;
            idx++;
            
            if (count > 1) {
                String str = Integer.toString(count);
                for (int j = 0; j < str.length(); j++) {
                    chars[idx] = str.charAt(j);
                    idx++;
                }
            }
        }
        
        return idx;
    }
}
