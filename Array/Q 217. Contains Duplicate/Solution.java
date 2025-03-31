import java.util.*;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) { // If add() returns false, duplicate found
                return true;
            }
        }
        return false;
    }
}
