package Week_1.Day_5;

public class ValidPalindrome {
        public boolean isPalindrome(String s) {
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < n ; i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                sb.append(s.charAt(i));
            }
        }
        String newString = sb.toString().toLowerCase();
        int left = 0 ;
        int right = newString.length() - 1;
        while(left < right){
            if(newString.charAt(left)==newString.charAt(right)){
                left++;
                right--;
            }
            else return false;
        }
        return true;
    }
}
