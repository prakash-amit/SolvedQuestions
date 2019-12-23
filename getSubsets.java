class getSubsets{
  static void get_all_subsets(List<Integer> v, List<HashSet<Integer>> sets) {
    int n = v.size();
    int numberOfSubsets = ( int )Math.pow( 2, n );
    System.out.println( numberOfSubsets );
    for( int i = 0; i < numberOfSubsets; i++ ) {
      HashSet<Integer> set = new HashSet<>();
      for( int j = 0; j < n; j++ ) {
        if( ( ( 1 << j ) & i ) != 0 ) {
          set.add( v.get( j ) );
        }
      }
      sets.add( set );
    }
  }
}  
