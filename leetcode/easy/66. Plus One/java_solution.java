class Solution {
    public int[] plusOne(int[] digits) {
        int i = digits.length - 1;
        while (i >= 0) {
            if (digits[i] != 9) {
                digits[i] += 1;
                break;
            } else{
                digits[i] = 0;
                i -= 1;
            }
        }
        if (i==-1) {
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            System.arraycopy(digits, 0, result, 1, digits.length);
            return result;
        }
        return digits;
    }
}