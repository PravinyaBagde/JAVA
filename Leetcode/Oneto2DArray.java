class Oneto2DArray {
    public List<List<Integer>> findMatrix(int[] nums) {

        //Output Array
        List<List<Integer>> result = new ArrayList<>();

//Here we are adding +1 because the index starts from 0
        int freq [] = new int[nums.length + 1] ;

        for(int i =0; i < nums.length; i++){

            if(freq[nums[i]] >= result.size()){
                //if the condition pass then we add a new row
                result.add(new ArrayList<>());
            }
            //Get that row and add it to the elements of row
            result.get(freq[nums[i]]).add(nums[i]);
            freq[nums[i]]++;
        }
        return result;
    }
}