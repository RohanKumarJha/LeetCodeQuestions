class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int count=2;
        for(int i=2; i<n; i++) {
            if(nums[i] != nums[count-2]) {
                nums[count] = nums[i];
                count++;
            }
        } return count;
    }
}