/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class SerializeAndDeserializeBinaryTree {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if( root == null ) return "null";

        String leftString = serialize( root.left );
        String rightString = serialize( root.right );

        return root.val + "," + leftString + "," + rightString;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        Queue<String> nodesLeft = new LinkedList<>();
        nodesLeft.addAll( Arrays.asList( data.split( "," ) ) );

        return deHelper( nodesLeft );
    }

    public TreeNode deHelper( Queue<String> nodesLeft ) {
        String currentNode = nodesLeft.poll();

        if( currentNode.equals( "null" ) ) return null;

        TreeNode newNode = new TreeNode( Integer.valueOf( currentNode ) );
        newNode.left = deHelper( nodesLeft );
        newNode.right = deHelper( nodesLeft );

        return newNode;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.deserialize(codec.serialize(root));
