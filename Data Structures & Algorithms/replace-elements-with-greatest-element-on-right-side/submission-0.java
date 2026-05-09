class Solution {
    public int[] replaceElements(int[] arr) {
        int[] ans = new int[arr.length];
        ans[ans.length-1] = -1;
        int k=0;
        
        for(int i =0 ; i < arr.length-1 ; i++){
           int max = arr[i+1]; 
            for(int j = i+1 ; j< arr.length ; j++){
              if( max < arr[j]){
                max = arr[j];
              }
             
             
            }
            ans[i] = max;
        }
       return ans; 
    }
}