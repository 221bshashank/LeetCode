class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        int mid = n/2;
        
        for (int i=0;i<n;i++) {
            int[] arr = image[i];  
            
            for (int j=0;j<mid;j++) {
                int tmp = arr[j];
                arr[j] = arr[n-j-1];
                arr[n-j-1] = tmp;                
            }            
            for (int j=0;j<n;j++) {
                arr[j] = arr[j] == 1? 0 : 1;
            }  
        }
        
        
        
        return image;
    }
    
    
}