 class Node {

    String name;
    Node prev, next;

    Node (String name)
    {
        this.prev = null;
        this.next = null;
        this.name = name;
    }
}

         public class DoubleLinkedList {

         Node head,current;

         // Add node with name in beginning of linkedlist, name as param
         public void insertAtBeginning(String name) {
             Node temp = new Node(name);
             if (head == null) {
                 head = temp;
             } else {
                 temp.next = head;
                 head.prev = temp;
                 head = temp;
             }
         }
 // Add node in beginning of linedlist, node as param
 public void insertAtBeginning(Node node) {
     Node temp_node = node;
     if (head == null) {
         head = temp_node;
     } else {
         temp_node.next = head;
         head.prev = temp_node;
         head = temp_node;
     }
 }
 // Add node in end of linedlist, name as param
 public void insertAtEnd(String name) {
     Node new_node = new Node(name);
     if (head == null) {
         head = new_node;
     } else {
         current = head;
         while (current.next != null) {
             current = current.next;
         }
         current.next = new_node;
         new_node.prev = current;
     }
         }
 // Add node in end of linedlist, node as param
 public void insertAtEnd(Node node) {
     Node temp_node = node;
     if (head == null) {
         head = temp_node;
     } else {
         current = head;
         while (current.next != null) {
             current = current.next;
         }
         current.next = temp_node;
         temp_node.prev = current;
     }
 }
 // Add node after name which is provided as param , name and node as params
 public void insertAfterName(String name, String newNodeName) {
     Node new_node = new Node(newNodeName);
     current = head;
     while (current != null) {
         if (current.name.equals(name)) {
             new_node.next = current.next;
             if (current.next != null) {
                 current.next.prev = new_node;
             }
             current.next = new_node;
             new_node.prev = current;
             return;
         }
         current = current.next;
     }
     System.out.println("Node with name " + name + " not found in the list.");
 }
 // Add node before name which is provided as param , name and node as params
 public void insertBeforeName(String name, String newNodeName) {
     Node new_node = new Node(newNodeName);
     current = head;
     while (current != null) {
         if (current.name.equals(name)) {
             new_node.next = current;
             new_node.prev = current.prev;
             if (current.prev != null) {
                 current.prev.next = new_node;
             } else {
                 head = new_node; // Update head if inserting before the first node.
             }
             current.prev = new_node;
             return;
         }
         current = current.next;
     }
     System.out.println("Node with name " + name + " not found in the list.");
 }
         // Make double linkedlist as Circular Double LinkedList
         public void makeCircular() {
             if (head != null) {
                 current = head;
                 while (current.next != null) {
                     current = current.next;
                 }
                 current.next = head;
                 head.prev = current;
             }
         }

         // Print all the nodes in linkedlist, make sure it works on circular double linkedl

             public void printAll() {
                 if (head == null) {
                     System.out.println("List is empty.");
                     return;
                 }
                 current = head;
                 do {
                     System.out.print(current.name + " -> ");
                     current = current.next;
                 } while (current != null);
                 System.out.println();
             }
 // Test the class
      public static void main(String[] args) {
          DoubleLinkedList l1 = new DoubleLinkedList();
           l1.insertAtBeginning("ali");
           l1.insertAtEnd("wajid");
           l1.insertAfterName("ali", "ahmed");
           l1.insertBeforeName("ahmed","asad");
           l1.insertAtEnd("saif");
           l1.printAll();
      }
         }
