package Week_2.Day_1;

public class RansomNote {
        public boolean canConstruct(String ransomNote, String magazine) {
        int n = ransomNote.length();
        int m = magazine.length();

        int[] arr = new int[26];
        for(int i = 0 ; i < m ; i++){
            arr[magazine.charAt(i)-'a'] += 1;
        }
        for(int i =0 ; i < n ; i++){
            int index = ransomNote.charAt(i)-'a';    
            arr[index] -= 1;
            if(arr[index]<0) return false;
        }
        return true;
    }
}
