class DupliRemoveSortedArray{
    public int removeDuplicates(int[] nums) {
        //Solution using two pointers methods

        int j = 0;
        for(int i =0; i < nums.length; i++){
            if(nums[j] != nums[i]){
                j=j+1;
                nums[j] = nums[i];
            }
        }
        return j=j+1;

    }
}