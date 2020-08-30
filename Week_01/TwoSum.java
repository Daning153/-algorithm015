class TwoSum{
	public int[] twoSum(int[] nums, int target) {
        if(nums.length < 2) return null;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<=nums.length-1; i++){
            if(map.containsKey(target-nums[i])){
                return new int[]{i, map.get(target-nums[i])};
            }
            map.put(nums[i],i);
        }
        return null;
    }
}