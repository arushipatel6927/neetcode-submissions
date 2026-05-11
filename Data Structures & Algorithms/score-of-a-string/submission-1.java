class Solution {
    public int scoreOfString(String s) {
        int sum =0;
        for(int i= s.length() -1 ; i > 0 ; i--){
            char ch = s.charAt(i);
            char ch1 = s.charAt(i-1);
           
            sum = sum + Math.abs(((int)ch)-((int)ch1));

          
        }
        return sum;
    }
}