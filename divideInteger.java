class divideInteger{
  public static int integer_divide(int x, int y) {
    if( y == 0 ) return -1;
    if( y == 1 ) return x;
    if( x == y ) return 1;
    if( x < y ) return 0;

    int q = 1;
    int temp = y;

    while( temp < x ) {
      temp <<= 1;
      q <<= 1;
    }

    if( temp > x ) {
      temp >>= 1;
      q >>= 1;

      return q + integer_divide( x - temp, y);
    }
    return q;
  }
}  
