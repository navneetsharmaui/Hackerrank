package DataStructures.LinkedLists;

/**
 * Created by Navneet Sharma (navneetzz) ryu on 4/7/17.
 */
public class GetNodeValue {
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
            node.next = new Node(d);
        }
    }
    void printList (Node node) {
        while (node!=null) {
            System.out.print(node.data+" ");
            node=node.next;
        }
        System.out.println();
    }
    void NthElement (int pos) {
        int len = 0;
        Node temp = head;
        while (temp!=null) {
            len++;
            temp=temp.next;
        }
        temp=head;
        for (int i=1;i<len-pos;i++)
            temp=temp.next;
        System.out.println(temp.data);
    }
    public static void main (String[] args) {
        GetNodeValue g = new GetNodeValue();
        for (int i=1;i<7;i++) g.push(i);
        g.printList(g.head);
        g.NthElement(0);
    }
}
