package DataStructures.LinkedLists;

/**
 * Created by Navneet Sharma (navneetzz) ryu on 4/7/17.
 */
public class MergeTwoLinkedList {
    private Node head1, head2, head3;
    static class Node {
        int data;
        Node next;
        Node (int d) {
            data=d;
            next=null;
        }
    }
    private void push(int new_data) {
        if (head3==null) {
            head3=new Node(new_data);
        } else {
            Node node = head3;
            while (node.next != null) {
                node = node.next;
            }
            node.next = new Node(new_data);
        }
    }
    private Node mergeLists(Node headA, Node headB) {
        while (headA!=null && headB!=null) {
            if (headA.data<headB.data) {
                push(headA.data);
                headA=headA.next;
            } else if (headA.data>headB.data) {
                push(headB.data);
                headB=headB.next;
            } else if (headA.data==headB.data) {
                push(headA.data);
            }
        }
        while (headA!=null) {
            push(headA.data);
            headA=headA.next;
        }
        while (headB!=null) {
            push(headB.data);
            headB=headB.next;
        }
        return head3;
    }

    private void printList(Node node) {
        while (node!=null) {
            System.out.print(node.data+" ");
            node=node.next;
        }
    }

    public static void main (String[] args) {
        MergeTwoLinkedList l = new MergeTwoLinkedList();
        l.head1 = new Node(1);
        l.head1.next = new Node(3);
        l.head1.next.next = new Node(5);
        l.head1.next.next.next = new Node(6);
        l.head2 = new Node(2);
        l.head2.next = new Node(4);
        l.head2.next.next = new Node(7);
        l.printList(l.mergeLists(l.head1, l.head2));
    }
}
