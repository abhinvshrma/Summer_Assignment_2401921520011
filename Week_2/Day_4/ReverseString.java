package Week_2.Day_4;

public class ReverseString {
        public String reverseWords(String s) {
        String[] arr = s.split(" ");
        for(int i = 0 ; i < arr.length ; i++){      
            arr[i] = new StringBuilder(arr[i]).reverse().toString();
        }
        return String.join(" " , arr);
    }
}
