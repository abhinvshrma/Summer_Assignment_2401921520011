package Week_2.Day_4;

import java.util.Stack;

public class DecodeString {
        public String decodeString(String s) {
        Stack<Integer> st1 = new Stack<>();
        Stack<StringBuilder> st2 = new Stack<>();
        StringBuilder curr = new StringBuilder();
        int num = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
            } else if (ch == '[') {
                st1.push(num);
                st2.push(curr);
                curr = new StringBuilder();
                num = 0;
            } else if (ch == ']') {
                int count = st1.pop();
                StringBuilder temp = st2.pop();
                for (int j = 0; j < count; j++) {
                    temp.append(curr);
                }
                curr = temp;
            } else {
                curr.append(ch);
            }
        }
        
        return curr.toString();
    }
}
