class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if (n > 10) {
            return this.countNumbersWithUniqueDigits(10);
        } if (n == 0) {
            return 1;
        }
        int sumNum = 0;
        while (n > 1) {
            int tempProduct = 9;
            for (int i = 1; i < n; i++) {
                tempProduct *= (10 - i);
            }
            sumNum += tempProduct;
            n -= 1;
        }
        sumNum += 10;
        return sumNum;
    }
}