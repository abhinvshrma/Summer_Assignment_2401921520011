package Week_2.Day_4;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {
        public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        solve(res, "", 0, 0, n);
        return res;
    }

    private void solve(List<String> res, String curr, int open, int close, int max) {
        if (curr.length() == max * 2) {
            res.add(curr);
            return;
        }

        if (open < max) {
            solve(res, curr + "(", open + 1, close, max);
        }
        
        if (close < open) {
            solve(res, curr + ")", open, close + 1, max);
        }
    }
}
