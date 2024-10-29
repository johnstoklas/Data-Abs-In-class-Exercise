public class Exercise9 {
    public class Node {
        int data; 
        Node left;
        Node right;

        int balanceFactor;
    }

    public int height(Node node) {
        if(node == null) {
            return 0;
        }
        else {
            int leftHeight = height(node.left);
            int rightHeight = height(node.right);
            return Math.max(leftHeight, rightHeight)+1;
        }
    }
    
    public int balanceFactor(Node node) {
        return height(node.right) - height(node.left);
    }

    public Node rotateLeft(Node node) {
        Node rightChild = node.right;
        node.right = rightChild.left;
        rightChild.left = node;

        return rightChild;
    }

    public Node rotateRight(Node node) {
        Node leftChild = node.left;
        node.left = leftChild.right;
        leftChild.right = node;

        return leftChild;
    }

}

