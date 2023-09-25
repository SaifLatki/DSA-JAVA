class Node3 {
    int data;
    Node3 next;

    Node3(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CheckCycleInList {
    Node3 head, current;

    public void addAtBeginning(int data) {
        Node3 node = new Node3(data);
        if (head == null) {
            head = node;
        } else {
            node.next = head;
            head = node;
        }
    }

    public void addAtEnd(int data) {
        Node3 n = new Node3(data);
        if (head == null) {
            head = n;
        } else {
            current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = n;
        }
    }

    public boolean cycleExists() {
        if (head == null || head.next == null) {
            return false;
        }
        Node3 h1 = head;
        Node3 h2 = head;
        while (h2 != null && h2.next != null) {
            h1 = h1.next;         // Move  one step
            h2 = h2.next.next;    // Move two steps

            if (h1 == h2) {
                return true;      // When both h1 and h2 meet, a cycle exists
            }
        }
        return false;            // When h2 reaches the end and no cycle exists
    }

    public void display() {
        Node3 curr = head;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        CheckCycleInList l1 = new CheckCycleInList();
        l1.addAtBeginning(1);
        l1.addAtEnd(2);
        l1.addAtEnd(3);
        l1.addAtEnd(4);
        l1.display();

        // Uncomment the following line to create a cycle in the list:
        // l1.head.next.next.next.next=l1.head;




        boolean hasCycle = l1.cycleExists();
        if (hasCycle) {
            System.out.println("The linked list contains a cycle.");
        } else {
            System.out.println("The linked list does not contain a cycle.");
        }
    }
}




