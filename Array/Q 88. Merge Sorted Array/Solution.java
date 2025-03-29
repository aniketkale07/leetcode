

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m - 1; // pointer for ending side nums1
        int j = n - 1; // pointer for ending side nums2

        int k = (m + n) - 1;

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                // if the i th element is grater than j th elemement then 
                //   nums1 goes to i-- other j--
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        // if the j have element
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }

    }
}