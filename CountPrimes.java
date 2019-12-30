class CountPrimes {
    public int countPrimes(int n) {
        int[] nums = new int[n];

        for( int i = 0; i < nums.length ; i++ ) {
            nums[i] = i;
        }

        for( int i = 2; i < nums.length; i++ ) {
            if( nums[i] == -1 ) {
                continue;
            }
            for( int j = 2*i; j < nums.length; j += i ) {
                if( nums[j] % nums[i] == 0 ) {
                    nums[j] = - 1;
                }
            }
        }

        int count = 0;
        for( int i = 2; i < nums.length; i++ ) {
            if( nums[i] != -1 ) {
                ++count;
            }
        }

        return count;

    }
}
