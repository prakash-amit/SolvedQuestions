class DecodingWays {
    public int numDecodings(String s) {

        int[] ways = new int[s.length() + 1 ];
        ways[0] = 1;
        ways[1] = s.charAt(0) != '0' ? 1 : 0;


        for( int i = 1; i < s.length(); i++ ) {

            if( s.charAt( i ) != '0' ) {
                ways[i + 1] = ways[i];
            }



            if( ( s.charAt( i - 1 ) == '1' ) ||
                ( ( s.charAt( i - 1 ) == '2' ) && ( s.charAt( i ) <= '6' ) ) ) {
                ways[i + 1] += ways[i - 1];
            }

        }

        return ways[s.length()];
    }
}
