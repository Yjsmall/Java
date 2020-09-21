/**
 * @author smallYJ
 */
public class ReverseList {
    public static void main(String[] args) {
        Node head = new Node();
        head = head.generateList(5);
        head.displayList(head);

    }
    private static Node reverseList(Node head){
        if (head == null || head.next == null){
            return head;
        }
        Node newList = reverseList(head.next);
        Node t1 = head.next;
        t1.next = head;
        head.next = null;
        return newList;
    }
}

class Node{
    int data;
    Node next;

    public Node(){}
    public Node(int x){
        data = x;
    }

    public Node generateList(int n){
        Node head = new Node();
        for (int i = n;i > 0;i--){
            head.next = new Node(n);
        }
        return head;
    }

    public void displayList(Node head){
        int i = 0;
        Node node = head.next;
        while (node.next != null){
            System.out.println(node.data);
            node = node.next;
            i++;
        }
        System.out.println("共"+i+"个元素");
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}


