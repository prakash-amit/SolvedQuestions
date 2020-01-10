class Node {

    int data;
    Node left, right;

    Node(int d)
    {
        data = d;
        left = right = null;
    }
}

class BinaryTree {

    Node root;

    // Function to find ceil of a given input in BST.
    // If input is more than the max key in BST,
    // return -1
    int Ceil(Node node, int input)
    {

        // Base case
        if (node == null) {
            return -1;
        }

        // We found equal key
        if (node.data == input) {
            return node.data;
        }

        // If root's key is smaller,
        // ceil must be in right subtree
        if (node.data < input) {
            return Ceil(node.right, input);
        }

        // Else, either left subtree or root
        // has the ceil value
        int ceil = Ceil(node.left, input);

        return (ceil >= input) ? ceil : node.data;
    }

    // Function to find floor of a given input in BST.
    // If input is less than the least key in BST,
    // return Integer.MAX_VALUE
    int floor(Node node, int input)
    {

        // Base case
        if (node == null) {
            return Integer.MAX_VALUE;
        }

        // We found equal key
        if (node.data == input) {
            return node.data;
        }

        // If root's key is larger,
        // floor must be in left subtree
        if (node.data > input) {
            return floor(node.left, input);
        }

        // Else, either right subtree or root
        // has the floor value
        int floor = floor(node.left, input);

        return (floor <= input) ? floor : node.data;
    }

  }
