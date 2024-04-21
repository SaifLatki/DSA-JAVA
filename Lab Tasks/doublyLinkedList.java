class Node2 {

    String name;
    Node2 prev, next;

    Node2 (String name)
    {
        this.prev = null;
        this.next = null;
        this.name = name;
    }
}

public class DoubleyListTail {

    Node head,tail,current;

    public void addAtBeginningWithTail(String name) {
        Node newNode = new Node(name);
        if (head == null) {
            head = newNode;
            tail = newNode; // set tail as the first element
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }
    public void addAtEndWithTail(String name) {
        Node newNode = new Node(name);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
    }
    public void removeFromBeginning() {
        if (head != null) {
            head = head.next;
            if (head == null) {
                tail = null; // when head becomes null tail also become null
            } else {
                head.prev = null;
            }
        }
    }

    public void removeFromEnd() {
        if (tail != null) {
            tail = tail.prev;
            if (tail == null) {
                head = null; // when tail becomes null head also become null
            } else {
                tail.next = null;
            }
        }
    }

    public void printAll() {
        Node current = head;
        while (current != null) {
            System.out.print(current.name + " -> ");
            current = current.next;
        }
        System.out.println();
    }


    // Test the class
    public static void main(String[] args){
        DoubleyListTail l1=new DoubleyListTail();
        System.out.println("=== list after adding elements at the end and beginning ===");
        l1.addAtBeginningWithTail("ali");
        l1.addAtEndWithTail("asad");
        l1.addAtEndWithTail("ahmed");
        l1.addAtBeginningWithTail("azal");
        l1.printAll();
        System.out.println("=== Removing from beginninig of the list ===");
        l1.removeFromBeginning();
        l1.printAll();
        System.out.println("=== Removing from the end of the list");
        l1.removeFromEnd();
        l1.printAll();


    }
}
