public class ReverseOrder {

    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node head;
    ReverseOrder() {
        head = null;
    }
    void addData(int data) {
        Node node = new Node(data);
        if(head == null) {
            head = node;
        }
        else {
            Node curr = head;
            while(curr.next != null) {
                curr = curr.next;
            }
            curr.next = node;
        }
    }
    void print() {
        Node curr = head;
        while(curr!=null) {
            System.out.print(curr.data+" --> ");
            curr = curr.next;
        }
        System.out.print("null");
    }
    void printReverse(Node head){
        if(head == null) {
            return;
        }
        printReverse(head.next);
        System.out.print(head.data+" --> ");

    }

    public static void main(String[] args) {
        ReverseOrder list = new ReverseOrder();
        list.addData(3);
        list.addData(9);
        list.addData(12);
        list.addData(15);
        list.addData(18);
        list.addData(21);

        list.printReverse(list.head);
        System.out.print("null");
    }


}
