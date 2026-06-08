package Week_2.Day_1;

public class ValidAnagram {
        public boolean isAnagram(String s, String t) {
        int[] arr = new int[26];
        int n = s.length();
        int m = t.length();
        if(n!=m) return false;
        for(int i = 0 ; i < n ; i++){
            arr[s.charAt(i) - 'a'] += 1;
        }
        for(int i = 0 ; i < m; i++){
            arr[t.charAt(i)-'a'] -= 1;
        }
        for(int i = 0 ; i < 26 ; i++){
            if(arr[i] != 0) return false;
        }
        return true;
    }
}
