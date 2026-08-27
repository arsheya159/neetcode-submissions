class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> array = new HashSet<>();
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