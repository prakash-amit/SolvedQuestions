class powerNum{
  static double power(double x, int n) {
    double result = 0.0;
    if( n < 0 ) {
      result = calPower( x, -1 * n );
      return 1 / result;
    }

    result = calPower( x, n );
    return result;
  }

  static double calPower( double x, int n ) {
    if( n == 0 ) return 1;
    if( n == 1 ) return x;

    double temp = calPower( x, n / 2);

    if( n % 2 == 0 ) {
      return temp * temp;
    }
    else {
      return x * temp * temp;
    }
  }

}
