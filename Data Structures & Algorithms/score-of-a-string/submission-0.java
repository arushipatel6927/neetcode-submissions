class Solution {
    public int scoreOfString(String s) {
        int sum =0;
        for(int i= s.length() -1 ; i > 0 ; i--){
            char ch = s.charAt(i);
            char ch1 = s.charAt(i-1);
            int n = (int) ch;
            int n1 = (int) ch1;
            int sub = Math.abs(ch-ch1);
            sum = sum + sub;

          
        }
        return sum;
    }
}