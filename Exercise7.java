public class Exercise7 {
    class Node {
        Node left;
        int val;
        Node right;
    }
    int min() {
        Node current = root;
        while(current != null && current.left != null) {
            current = current.left;
        }
        return current.val;

    }
    int max() {
        Node current = root;
        while(current != null && current.right != null) {
            current = current.right;
        }
        return current.val;
    }
    public boolean isBalanced(Node root) {
        if(root == null) {
            return true;
        }
        int left = height(root.left);
        int right = height(root.right);
        if(Math.abs(left-right) > 1) {
            return false;
        }
        else if(!isBalanced(root.left) || !isBalanced(root.right)) {
            return false;
        }
        return true;
    }
    public int height(Node curr) {
        if(curr == null) {
            return 0;
        }
        int leftHeight = height(curr.left);
        int rightHeight = height(curr.right);
        
        return Math.max(leftHeight, rightHeight) + 1;
    }
}
