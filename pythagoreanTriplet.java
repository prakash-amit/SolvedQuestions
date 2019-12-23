class pythagoreanTriplet{
  static List<int[]> find_pythagorean_triplets(int[] arr) {
    List<int[]> triplets = new ArrayList<int[]>();

    Arrays.sort( arr );

    for( int i = arr.length - 1; i > 1; i-- ) {
      int c2 = arr[i] * arr[i];
      if( c2 == 0 ) {
        continue;
      }

      int low = 0;
      int high = i - 1;

      while( low < high ) {
        int a2 = arr[low] * arr[low];
        int b2 = arr[high] * arr[high];
        if( a2 + b2 == c2 ) {
          triplets.add(0, new int[] { arr[low], arr[high], arr[i] });
          break;
        }
        else if( a2 + b2 < c2 ) {
          low++;
        }
        else {
          high--;
        }
      }
    }
    return triplets;
  }
}
