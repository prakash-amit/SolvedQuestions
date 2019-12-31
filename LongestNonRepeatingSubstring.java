class LongestNonRepeatingSubstring {
    public int lengthOfLongestSubstring(String s) {
        if( s == null || s.length() == 0 ) return 0;

        int count = 1;
        int b = 0;
        int e = 1;
        Set<Character> set = new HashSet<>();
        set.add( s.charAt( 0 ) );

        while( e < s.length() ) {
            if( !set.contains( s.charAt( e ) ) ) {
                set.add( s.charAt( e ) );
                count = Math.max( count, e - b + 1 );
            }
            else {
                while( s.charAt( b ) != s.charAt( e ) ) {
                    set.remove( s.charAt( b ) );
                    ++b;
                }
                ++b;
            }
            ++e;
        }

        return count;
    }
}
