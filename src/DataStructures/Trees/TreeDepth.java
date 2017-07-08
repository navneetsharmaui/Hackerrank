package DataStructures.Trees;

/**
 * Created by Navneet Sharma (navneetzz) ryu on 8/7/17.
 */
public class TreeDepth {
    Node root;
    static class Node {
        int data;
        Node right, left;
        Node (int d) {
            data=d;
            right=left=null;
        }
    }
    private int maxDepth (Node node) {
        if (node==null) return -1;
        else {
            int lDepth = maxDepth(node.left);
            int rDepth = maxDepth(node.right);

            return Math.max(lDepth, rDepth)+1;
        }
    }

    public static void main (String[] args) {
        TreeDepth d = new TreeDepth();
        d.root = new Node(5);
        d.root.left = new Node(3);
        d.root.right = new Node(6);
        d.root.left.left = new Node(2);
        d.root.left.right = new Node(4);
        System.out.println(d.maxDepth(d.root));
    }
}
