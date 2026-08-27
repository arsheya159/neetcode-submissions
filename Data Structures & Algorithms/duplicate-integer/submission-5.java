class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> array = new HashSet<>(nums.length);
        for(int x: nums)
        {
            if(array.contains(x))
            {
                return true;
            }
            array.add(x);
        }
    return false;
    }
}