class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set numsSet = new HashSet<Integer>(nums.length);
        for (int i: nums) {
            if (numsSet.contains(i)) {
                return true;
            }
            numsSet.add(i);
        }
        return false;
    }
}