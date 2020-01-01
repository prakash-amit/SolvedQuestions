class LongestPallindromicSubstring {
    public String longestPalindrome(String s) {
        if( s == null ) return null;
        if( s.length() <= 1 ) return s;

        int start = 0;
        int end = 0;

        for( int i = 0; i < s.length() - 1; i++ ) {
            int odd = logestPallindromeAround( s, i, i );
            int even = logestPallindromeAround( s, i, i + 1 );

            int currentMax = Math.max( odd, even );
            if( currentMax > end - start + 1 ) {
                start = i - ( currentMax - 1 ) / 2;
                end = i + ( currentMax / 2 );
            }
        }

        return s.substring( start, end + 1 );
    }

    public static int logestPallindromeAround( String s, int left, int right ) {
        while(left >= 0 && right < s.length() && (s.charAt( left ) == s.charAt( right ) ) ) {
            --left;
            ++right;
        }

        return right - left - 1;
    }

}
