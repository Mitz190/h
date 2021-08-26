class MissingNo {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for(int i=0 ; i<n ; i++)
        {
            sum += nums[i];
        }
        return ((n*(n+1))/2-sum);
    }
}

//using the approach of sum of n natural numbers.
//include zero while running the self test cases
//test case:
/* 
Input: nums = [0,1]
Output: 2
Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in nums.
*/
