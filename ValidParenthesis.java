class ValidParenthesis {
    public boolean isValid(String s) {
       Stack<Character> stack = new Stack<>();

        int currentIndex = 0;
        int stringLength = s.length();

        Map<Character, Character> map = new HashMap<>();

        map.put( '}', '{');
        map.put( ')', '(');
        map.put( ']', '[');

        while( currentIndex < stringLength ) {
            if( s.charAt( currentIndex ) == '(' || s.charAt( currentIndex ) == '{'
              || s.charAt( currentIndex ) == '[') {
                stack.push( s.charAt( currentIndex ) );
            }
            else {
                if(!stack.isEmpty() && (stack.peek() == map.get( s.charAt( currentIndex ) ) ) ) {
                    stack.pop();
                }
                else {
                    return false;
                }
            }
            currentIndex++;
        }

        if( stack.isEmpty() ) {
            return true;
        }

        return false;
    }
}
