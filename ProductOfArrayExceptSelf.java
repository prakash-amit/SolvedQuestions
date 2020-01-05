class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        if( nums == null || nums.length <= 1 ) return nums;

        int[] result = new int[nums.length];
        result[0] = 1;

        for( int i = 1; i < nums.length; i++ ) {
            result[i] = result[i - 1 ] * nums[i - 1];
        }

        int right = 1;

        for( int i = nums.length - 2; i >= 0; i-- ) {
            result[i] *= right * nums[i + 1];
            right *= nums[i + 1];
        }

        return result;

    }
}
