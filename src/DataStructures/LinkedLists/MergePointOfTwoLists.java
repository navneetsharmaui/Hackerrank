package DataStructures.LinkedLists;

/**
 * Created by Navneet Sharma (navneetzz) ryu on 4/7/17.
 */
public class MergePointOfTwoLists {
    Node head1, head2;
    static class Node {
        int data;
        Node next;
        Node (int d) {
            data=d;
            next=null;
        }
    }
    int getNode () {
        int a = getCount(head1);
        int b = getCount(head2);
        if (a>b) {
            int d=a-b;
            return getIntersection(head1, head2, d);
        } else {
            int d = b-a;
            return getIntersection(head2, head1, d);
        }
    }
    int getIntersection (Node node1, Node node2, int d) {
        Node current1=node1;
        Node current2=node2;
        for (int i=0;i<d;i++) {
            if (current1==null) return -1;

            current1=current1.next;
        }

        while (current1!=null && current2!=null) {
            if (current1.data==current2.data) return current1.data;

            current1=current1.next;
            current2=current2.next;
        }
        return -1;
    }
    int getCount (Node node) {
        int count = 0;
        while (node!=null) {
            count++;
            node=node.next;
        }
        return count;
    }
    public static void main (String[] args) {
        MergePointOfTwoLists m = new MergePointOfTwoLists();
        m.head1 = new Node(3);
        m.head1.next = new Node(6);
        m.head1.next.next = new Node(9);
        m.head1.next.next.next = new Node(15);
        m.head1.next.next.next.next = new Node(30);

        m.head2 = new Node(10);
        m.head2.next = new Node(15);
        m.head2.next.next = new Node(30);

        System.out.println(m.getNode());
    }
}
