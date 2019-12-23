class permuteString{
  static List<String> permute_string(String input) {
    List<String> result = new ArrayList<String>();

    char tempArray[] = input.toCharArray();
    Arrays.sort(tempArray);

    result.add( new String( tempArray ) );

    String nextPermutation = nextPermutation( tempArray );
    while( nextPermutation != null ) {
      result.add( nextPermutation );
      nextPermutation = nextPermutation( tempArray );
    }

    return result;
  }

  static String nextPermutation( char[] input ) {
    int x = input.length - 2;

    while( x >= 0 && input[x] > input[x+1]) {
      --x;
    }
    if( x < 0 ) {
      return null;
    }

    int y = input.length - 1;
    while(y > x && input[x] > input[y] ) {
      --y;
    }
    swap( input,x, y);
    reverse( input, x + 1);

    return new String( input );
  }

  static void swap( char[] input, int x, int y ) {
    char temp = input[x];
    input[x] = input[y];
    input[y] = temp;
  }

  static void reverse( char[] input, int x ) {
    int y = input.length - 1;
    while( x < y ) {
      swap(input,x, y);
      ++x;
      --y;
    }
  }

}  
