class MoveZerosToEnd {
    public void moveZeroes(int[] nums) {
        if( nums == null || nums.length <= 1 ) return;

        int slow = 0;

        for( ; slow < nums.length; slow++ ) {
            if( nums[slow] == 0 ) {
                break;
            }
        }

        if( slow >= nums.length - 1 ) return;

        int fast = slow + 1;

        while( fast < nums.length ) {
            if( nums[fast] != 0 ) {
                nums[slow++] = nums[fast];
                nums[fast++] = 0;
            }
            else {
                ++fast;
            }
        }
    }
}
