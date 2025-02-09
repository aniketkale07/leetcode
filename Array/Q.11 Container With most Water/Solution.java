class Solution {

   
    public int maxArea(int[] height) {
        int maxArea =0;
        int start=0;
        int end=height.length-1;

        while(start<end){
                int distance=end-start;
                int minHeight = Math.min(height[start], height[end]);

               maxArea= Math.max(maxArea, distance * minHeight);

               if(height[start]<height[end]){
                start++;
               }else{
                end--;
               }
           
        }


        return maxArea;
    }
}