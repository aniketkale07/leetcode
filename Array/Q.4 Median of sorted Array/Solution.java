import java.util.Arrays;

class Solution {

    public double getMedian(int a, int b){
        double median= (a+b)/2.0;
        return median;
    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int merged[] = new int[nums1.length + nums2.length];
    
        System.arraycopy(nums1, 0, merged , 0 , nums1.length);
        System.arraycopy(nums2, 0 , merged, nums1.length, nums2.length);

        Arrays.sort(merged);

        int mid=merged.length/2;
         
         if(merged.length%2==0){
             return getMedian(merged[mid - 1], merged[mid]);
                
         }else{
              return merged[mid];
         }
         
       
    
    


    }
}