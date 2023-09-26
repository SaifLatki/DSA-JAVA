class Stack
{
         private int arr[];
         private int top;
         private int capacity;
    int count=0;

         // Constructor to initialize stack
         Stack(int size)
         {
         arr = new int[size];
         capacity = size;
         top = -1;

         }
         // Utility function to add an element x in the stack and check for stack overflow
         public void push(int x)
         {
             System.out.println("Inserting "+x);
             if(size()==arr.length) {
                 System.out.println("Stack is Full");
             }
             else{
                 arr[++top]=x;
             }
             count++;
         }

         // Utility function to pop top element from the stack and check for stack underflow

         public int pop()
         {

             int temp=arr[top];
             System.out.println("Removing "+temp);
             arr[top]=0;
             top--;
             count--;
             return temp;


         }
         // Utility function to return top element in a stack
         public int peek()
         {
         return arr[top];
         }

         // Utility function to return the size of the stack
         public int size()
         {
         return count;
         }

         // Utility function to check if the stack is empty or not
         public Boolean isEmpty()
         {
             if(top==-1){
                 return true;
             }
             else {
                 return false;
             }

         }

         // Utility function to check if the stack is full or not
        public Boolean isFull()
        {
            if(size()==capacity){
                return true;

            }
            else{
                return false;
            }

         }

         public static void main (String[] args)
         {
         Stack stack = new Stack(3);

         stack.push(1); // Inserting 1 in the stack
         stack.push(2); // Inserting 2 in the stack

         stack.pop(); // removing the top 2
         stack.pop(); // removing the top 1

         stack.push(3); // Inserting 3 in the stack

         System.out.println("Top element is: " + stack.peek());
         System.out.println("Stack size is " + stack.size());

         stack.pop(); // removing the top 3

         // check if stack is empty
         if (stack.isEmpty())
         System.out.println("Stack Is Empty");
         else
         System.out.println("Stack Is Not Empty");
         }
}
