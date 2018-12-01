class Persist {
    public static int persistence(long n) {
        int count = 0;
        while (n >= 10) {
            n = digitMultiply(n);
            count += 1;
        }
        return count;
    }

    private static int digitMultiply(long n) {
        int result = 1;
        while (n > 0) {
            result *= n % 10;
            n /= 10;
        }
        return result;
    }
}