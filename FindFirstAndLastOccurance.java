class FindFirstAndLastOccurance {
    public int[] searchRange(int[] nums, int target) {

        int[] result = new int[2];

        if( nums == null || nums.length == 0) {
            result[0] = -1;
            result[1] = -1;
            return result;
        }

        result[0] = searchOccurance( nums, target, true );
        result[1] = searchOccurance( nums, target, false );

        return result;
    }

    private int searchOccurance( int[] nums, int target, boolean firstOccurance ) {
        int left = 0;
        int right = nums.length - 1;

        int index = -1;

        while( left <= right ) {
            int mid = left + ( right - left ) / 2;

            if( nums[mid] == target ) {
                index = mid;
                if( firstOccurance ) {
                    right = mid - 1;
                }
                else {
                    left = mid + 1;
                }

            }
            else if( nums[mid] > target ) {
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }

        return index;
    }
}
