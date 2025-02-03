class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<nums.length-1;i++){
            int complement = target-nums[i];

            for(int j=i+1;j<nums.length;j++){
                if(nums[j]==complement){
                    return new int[] {i, j};
                }
            }
        }
        return new int[0];
    }
}