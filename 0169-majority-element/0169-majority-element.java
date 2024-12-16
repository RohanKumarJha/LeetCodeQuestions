class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i=0; i<n; i++) {
            if(map.containsKey(nums[i])) {
                map.put(nums[i],map.get(nums[i])+1);
            } else {
                map.put(nums[i],1);
            }
        }
        for(Integer i : map.keySet()) {
            if(map.get(i) > n/2) return i;
        } return 0;
    }
}