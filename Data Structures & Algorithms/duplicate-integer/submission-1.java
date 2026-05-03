class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> setInt = new HashSet<>();

        for (Integer num : nums) {
            if (!setInt.add(num)) {
                return true;
            }
        }
        return false;
    }
}