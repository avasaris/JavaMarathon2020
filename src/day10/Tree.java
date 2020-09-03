package day10;

public class Tree {
    private final Node root;

    public Tree(int ...array) {
        this.root = new Node(array[0]);

        for(int i=1; i<array.length; i++) Node.addTreeValue(root, array[i]);
    }

    public void printSortedTree(){
        Node.returnSortedNodes(root);
    }
}
