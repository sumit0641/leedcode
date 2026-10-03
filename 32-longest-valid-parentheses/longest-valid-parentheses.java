class Solution {
    public int longestValidParentheses(String s) {
        int n = s.length();
        if( n <=1){
            return 0;
        }
        int maxlen=0;
        int[] dp=new int[n];
        for (int i = 1; i < n; i++) {
            
            if (s.charAt(i) == ')') {

               
                if (s.charAt(i - 1) == '(') {
                    dp[i] = 2;
                    if (i >= 2) {
                        dp[i] += dp[i - 2];
                    }
                }

           
                else {
                    int index = i - dp[i - 1] - 1;

                    if (index >= 0 && s.charAt(index) == '(') {
                        dp[i] = dp[i - 1] + 2;
                        
                        if (index >= 1) {
                            dp[i] += dp[index - 1];
                        }
                    }
                }

                maxlen = Math.max(maxlen, dp[i]);
            }
        }

        return maxlen;



        
    }
}