class FirstMissingPositive {
    public int firstMissingPositive(int[] A) {
        int i = 0;
        
        while( i < A.length ) {
            if( (1 <= A[i] && A[i] <= A.length) && (A[i] != A[ A[i] - 1 ] ) ) {
                swap( A, i, A[i] - 1 );
            }
            else {
                ++i;
            }
        }

        for( int j = 0; j < A.length; j++ ) {
            if( A[j] <= 0 || A[j] != j + 1 ) {
                return j + 1;
            }
        }

        return A.length + 1;
    }

    public static void swap( int[] A, int i, int j ) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}
