class MinimumSizeSubarraySum {
    public int minSubArrayLen(int s, int[] nums) {
        if( nums == null || nums.length == 0 ) return 0;
        if( nums.length == 1 && nums[0] < s ) return 0;

        int i = 0;
        int j = 0;
        int sum = 0;

        int minimalLength = Integer.MAX_VALUE;

        while( j < nums.length ) {
            //expanding window
            sum += nums[j];
            if( sum >= s ) {
                minimalLength = Math.min( minimalLength, j - i + 1 );
            }

            //shrinking window
            while( sum - nums[i] >= s ) {
                sum -= nums[i];
                i++;
                minimalLength = Math.min( minimalLength, j - i + 1 );
            }

            j++;
        }

        if( sum < s ) return 0;

        return minimalLength;
    }
}
