/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class CountUnivalSubtree {
    static int count = 0;
    public int countUnivalSubtrees(TreeNode root) {
        if( root == null ) return 0;
        isUnival( root );

        return count;
    }

    public static boolean isUnival( TreeNode root ) {

        if( root.left == null && root.right == null ) {
            count++;
            return true;
        }

        boolean isUnival = true;

        if( root.left != null ) {
            isUnival =  isUnival( root.left ) && isUnival && root.left.val == root.val;
        }

        if( root.right != null ) {
            isUnival = isUnival( root.right ) && isUnival && root.right.val == root.val;
        }

        if( !isUnival ) {
            return false;
        }
        count++;
        return true;
    }
}
