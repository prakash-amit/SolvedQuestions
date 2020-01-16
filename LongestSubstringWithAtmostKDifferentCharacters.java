class LongestSubstringWithAtmostKDifferentCharacters {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        if( s == null || s.length() == 0 ) return 0;
        if( s.length() < k ) return s.length();

        int i = 0;
        int[] alphabate = new int[256];
        int distinct = 0;
        int result = 0;

        for( int j = 0; j < s.length(); j++ ) {
            if( alphabate[s.charAt(j)]++ == 0 ) {
                distinct++;
            }
            if( distinct > k ) {
                while( --alphabate[s.charAt(i++)] > 0 );
                distinct--;
            }

            result = Math.max( result, j - i + 1 );
        }

        return result;
    }
}
