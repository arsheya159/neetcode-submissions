class Solution 
{
    public boolean hasDuplicate(int[] nums) 
    {
        Set<Integer> array = new HashSet<>();
        for(int x: nums)
        {
            if (!(array.add(x))) 
                return true;
        }
    return false;
    }
}
