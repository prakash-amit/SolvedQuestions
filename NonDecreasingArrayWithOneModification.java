class NonDecreasingArrayWithOneModification {
    public boolean checkPossibility(int[] nums) {
        if( nums == null || nums.length <= 2 ) return true;

        int count = 0;
        int problemIndex = - 1;
        for( int i = 0; i < nums.length - 1; i++ ) {
            if( nums[i] > nums[i + 1] ) {
                ++count;
                problemIndex = i;
            }
        }

        if( count == 0 ) return true;
        else if( count > 1 ) return false;
        else {
            //A[problemIndex] can be set equal to A[problemIndex + 1]
            if( problemIndex == 0 ) return true;

            //A[problemIndex + 1] can be set equal to A[problemIndex]
            if( problemIndex == nums.length - 2 ) return true;

            //all of A[problemIndex - 1], A[problemIndex], A[problemIndex + 1],
            //and A[problemIndex + 2] exist
            else {
                //We could change A[p] to be between A[p-1] and A[p+1]
                //or, We could change A[p + 1] to be between A[p] and A[p+2]
                if( nums[problemIndex - 1] <= nums[problemIndex + 1] ||
                    nums[problemIndex] <= nums[problemIndex + 2] ) {
                   return true;
                }
                return false;
            }
        }
    }
}
