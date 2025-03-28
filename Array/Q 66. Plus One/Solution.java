class Solution {
    public int[] plusOne(int[] digits) {
        int length = digits.length;

        // Iterate from last digit to the first
        for (int i = length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;  // If digit < 9, just add 1
                return digits;
            }
            digits[i] = 0;  // If digit is 9, set it to 0
        }

        // If all digits were 9, we need a new array
        int[] arr = new int[length + 1];
        arr[0] = 1;  // First digit becomes 1, rest remain 0
        return arr;
    }
}
