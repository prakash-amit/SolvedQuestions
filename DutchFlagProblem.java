class DutchFlagProblem {
    public void sortColors(int[] A) {
        if( A == null || A.length <= 1 ) {
            return;
        }

        int i = 0;
        int j = 0;
        int k = A.length - 1;

        while( i < A.length ) {
            if( A[i] == 2 && k > i ) {
                swap( A, i, k );
                --k;
            }
            else if ( A[i] == 0 && j < i ) {
                swap( A, i, j );
                ++j;
            }
            else {
                ++i;
            }
        }
    }

    public static void swap( int[] A, int i, int j ) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}
