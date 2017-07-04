package DataStructures.LinkedLists;

/**
 * Created by Navneet Sharma (navneetzz) ryu on 4/7/17.
 */
public class DeleteDuplicationElementsFromSortedList {
    Node head;
    static class Node {
        int data;
        Node next;
        Node (int d) {
            data=d;
            next=null;
        }
    }
    void push (int d) {
        if (head==null) {
            head=new Node(d);
        } else {
            Node node = head;
            while (node.next!=null) {
                node=node.next;
            }
            node.next=new Node(d);
        }
    }
    void printList (Node node) {
        while (node!=null) {
            System.out.print(node.data+" ");
            node=node.next;
        }
        System.out.println();
    }
    Node removeDuplicate (Node node) {
        if (node==null) return null;
        while (node.next!=null) {
            if (node.data==node.next.data) {
                node.next=node.next.next;
            } else {
                node=node.next;
            }
        }
        return head;
    }
    public static void main (String[] args) {
        DeleteDuplicationElementsFromSortedList d = new DeleteDuplicationElementsFromSortedList();
        d.push(1);
        for (int i=1;i<6;i++) {
            if (i==3) {
                d.push(3);
            }
            d.push(i);
        }
        d.printList(d.head);
        d.removeDuplicate(d.head);
        d.printList(d.head);
    }
}
