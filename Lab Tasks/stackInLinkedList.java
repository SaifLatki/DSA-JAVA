class Node2
    {
     int data; // integer data
        Node2 next; // pointer to the next node
         };
class StackLinkedList {
    private Node2 top;

    public StackLinkedList() {
        this.top = null;
    }

    // Utility function to add an element x in the stack
    public void push(int x) // insert at the beginning
    {
        System.out.println("Inserting "+x);
        Node2 temp = new Node2();
        temp.data = x;
        temp.next = top;
        top = temp;


    }

    // Utility function to pop top element from the stack and check for Stack underflow

    public void pop() // remove at the beginning
    {
        System.out.println("Removing "+top.data);
        if (top == null) {
            System.out.println("Stack is Empty");
        } else {
            top = top.next;

        }


    }

    // Utility function to check if the stack is empty or not
    public boolean isEmpty() {
        if (top == null) {
            return true;

        } else {
            return false;
        }

    }

    // Utility function to return top element in a stack
    public int peek() {
        return top.data;
    }
}

         class StackImpl
 {
         public static void main(String[] args)
         {
         StackLinkedList stack = new StackLinkedList();

         stack.push(1);
         stack.push(2);
         stack.push(3);

         System.out.println("Top element is " + stack.peek());

         stack.pop();
        stack.pop();
         stack.pop();

         if (stack.isEmpty()) {
         System.out.print("Stack is empty");
         } else {
         System.out.print("Stack is not empty");
         }
         }
 }
