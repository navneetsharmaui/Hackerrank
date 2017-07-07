package DataStructures.Trees;

/**
 * Created by Navneet Sharma (navneetzz) ryu on 8/7/17.
 */
public class TreeTraversal {
    Node root;
    static class Node {
        int data;
        Node right, left;
        Node (int d) {
            data=d;
            right=left=null;
        }
    }
    private static void preOrder (Node node) {
        if (node==null) return;
        System.out.print(node.data+" ");
        preOrder(node.left);
        preOrder(node.right);
    }
    private static void postOrder (Node node) {
        if (node==null) return;
        preOrder(node.left);
        preOrder(node.right);
        System.out.print(node.data+" ");
    }
    private static void inOrder (Node node) {
        if (node==null) return;
        preOrder(node.left);
        System.out.print(node.data+" ");
        preOrder(node.right);
    }
    public static void main (String[] args) {
        TreeTraversal t = new TreeTraversal();
        t.root = new Node(5);
        t.root.left = new Node(3);
        t.root.left.right = new Node(4);
        t.root.left.left = new Node(2);
        t.root.right = new Node(6);
        t.preOrder(t.root);
        System.out.println();
        t.postOrder(t.root);
        System.out.println();
        t.inOrder(t.root);
    }
}
