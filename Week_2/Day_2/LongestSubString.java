package Week_2.Day_2;

public class LongestSubString {
        public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int left = 0 ;
        int[] freq = new int[128];
        int length = 0 ;

        for(int right = 0 ; right < n ; right++){
            char rightChar = s.charAt(right);
            freq[rightChar]++;

            while(freq[rightChar]>1){
                char leftChar = s.charAt(left);
                freq[leftChar]--;
                left++;
            }
            int newLen = ( right - left )+1;
            length = Math.max(length , newLen);
        }
        return length;
    }
}
