class Node1 {
    int data;
    Node1 next;

    Node1(int data) {
        this.data = data;
        this.next = null;
    }
}

public class ReplacingNodes {
    Node1 head, curr;

    void addLast(int data) {
        Node1 n2 = new Node1(data);
        if (head == null) {
            head = n2;
        } else {
            curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = n2;
        }
    }

    void replaceNode(int m, int n) {
        curr = head;
        while (curr != null) {
            if (curr.data == m) {
                curr.data = n;
            } else if (curr.data == n) {
                curr.data = m;
            }
            curr = curr.next;
        }
    }

    void display() {
        curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String args[]) {
        ReplacingNodes l1 = new ReplacingNodes();
        l1.addLast(1);
        l1.addLast(2);
        l1.addLast(4);
        l1.addLast(6);
        System.out.println("Before change:");
        l1.display();
        l1.replaceNode(2, 6);
        System.out.println("After change:");
        l1.display();
    }
}
