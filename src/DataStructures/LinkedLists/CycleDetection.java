package DataStructures.LinkedLists;

/**
 * Created by Navneet Sharma (navneetzz) ryu on 4/7/17.
 */
public class CycleDetection {
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
    }
    boolean detectLoop (Node node) {
        if (node==null)
            return false;

        Node fast = node;
        Node slow = node;
        while (slow!=null && fast!=null && fast.next!=null) {
            fast=fast.next.next;
            slow=slow.next;
            if (slow==fast)
                return true;
        }
        return false;
    }
    public static void main (String[] args) {
        CycleDetection c = new CycleDetection();
        for (int i=1;i<7;i++)
            c.push(i);
        c.head.next.next.next.next.next=c.head.next;
        System.out.println(c.detectLoop(c.head));
    }
}
