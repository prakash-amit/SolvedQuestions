class kth_permutation {
  static void find_kth_permutation( List<Character> v, int k, StringBuilder result) {
    while( !v.isEmpty() & k >= 1) {
      int blockSize = factorial ( v.size() - 1 );
      int selectedCharacterIndex = ( k - 1 ) / blockSize ;
      result.append( v.get( selectedCharacterIndex ) );
      v.remove( selectedCharacterIndex );
      k = k - blockSize * selectedCharacterIndex ;
    }
  }

  static int factorial( int n ) {
    if( n <= 1 ) return 1;

    int result = 1;
    for( int i = 2; i <= n; i++ ) {
      result *= i;
    }

    return result;
  }
}  
