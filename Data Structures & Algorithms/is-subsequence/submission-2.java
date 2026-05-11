class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length() == 0 ){
            return true;
        }
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        int i=0;
        int j=0;
        int n1 = arr1.length;
        int n2 = arr2.length;

        while(i < n1 && j < n2){
            if(arr1[i] == arr2[j]){
                i++;
            }
            j++;
        }
      return i == n1;  
    }
}