class maxProdThreeNo {
    public int maximumProduct(int[] nums) {
       Arrays.sort(nums);
        int length = nums.length;
        int allPositiveMax = nums[length - 1] * nums[length - 2] * nums[length - 3]; // if all positive numbers then get last 3 based on sorting
        int negativeMax = nums[0] * nums[1] * nums[length - 1]; //if there are negative numbers, try to find the max by getting two max negative numbers and one positive or max negative number
        return Math.max(allPositiveMax, negativeMax); //return the maximum based on all positive or negative max
    }
}

//link for the question
//https://leetcode.com/problems/maximum-product-of-three-numbers
