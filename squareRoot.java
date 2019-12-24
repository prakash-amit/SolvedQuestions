class squareRoot{
  private static final double EPSILON = 0.00001;

  public static double square_root_iterative(double num) {
    double low = 0;
    double high = num;

    while( low <= high ) {
      double mid = low + ( high - low ) / 2;
      System.out.println( mid * mid );
      if( Math.abs( mid * mid - num ) <= EPSILON ) {
        return mid;
      }
      else if( mid * mid < num ) {
        low = mid;
      }
      else {
        high = mid;
      }
    }

    return -1;
  }

}
