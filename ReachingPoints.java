class ReachingPoints {
    public boolean reachingPoints(int sx, int sy, int tx, int ty) {
        //determine if (sx, sy) -> (tx, ty) is possible
        //allowed moves - (sx, sy) -> ( sx + sy, sy )
        //or (sx, sy) -> (sx, sy + sx) as next steps.

        while( tx >= sx && ty >= sy ) {
            if( tx == ty ) break;

            if( tx > ty ) {
                if( ty > sy ) {
                    tx = tx % ty;
                }
                else {
                    return ( tx - sx ) % ty == 0;
                }
            }
            else {
                if( tx > sx ) {
                    ty = ty % tx;
                }
                else {
                    return ( ty - sy ) % sx == 0;
                }
            }
        }

        if( tx == sx && ty == sy ) {
            return true;
        }
        else {
            return false;
        }
    }
}
