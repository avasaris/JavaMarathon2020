package day10;

public class Node {
    private final int val;
    Node left = null;
    Node right = null;

    public Node(int val) {
        this.val = val;
    }

    public static void returnSortedNodes(Node root) {
        if (root.left != null) {
            returnSortedNodes(root.left);
        }

        if (root.right != null) {
            System.out.println(root.val);
            returnSortedNodes(root.right);
        }

        if(root.left==null && root.right==null) System.out.println(root.val);

    }

    public static void addTreeValue(Node root, int val) {
        if (val <= root.val) {
            if (root.left == null) {
                root.left = new Node(val);
            } else {
                addTreeValue(root.left, val);
            }
        } else {
            if (root.right == null) {
                root.right = new Node(val);
            } else {
                addTreeValue(root.right, val);
            }
        }
    }

}
