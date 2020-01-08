class SingleNumber {
    public int singleNumber(int[] nums) {
        if( nums == null || nums.length == 0 ) return -1;
        if( nums.length == 1 ) return nums[0];

        int i = nums[0];

        for( int j = 1; j < nums.length; j++ ) {
            i ^= nums[j];
        }

        return i;
    }
}
