// Class for queue
class QueueArray
{
    private int arr[];
    private int front;
    private int rear;
    private int capacity;
    private int count;

    // Constructor to initialize queue
    QueueArray(int size)
    {
        arr = new int[size];
        capacity = size;
        front = 0;
        rear = -1;
        count = 0;
    }



    // Utility function to add an item to the queue and check for queue overflow
    public void enqueue(int item)
    {
        // Write your code here
        System.out.println("Inserting "+item);
        rear=(rear+1)%capacity;
        count++;

    }
// Utility function to remove front element from the queue and check for Queue Unde

    public int dequeue()
    {
// Write your code here
        int temp=arr[front];
        if(isEmpty()){
            System.out.println("The Queue is Empty");
        }
        else{

            front=(front+1)%capacity;

        }
        return temp;

    }

    // Utility function to return front element in the queue and check for Queue Underflow
    public int peek()
    {
        // Write your code here
        return front;
    }

    // Utility function to return the size of the queue
    public int size()
    {
        // Write your code here
        return count;

    }

    // Utility function to check if the queue is empty or not
    public Boolean isEmpty()
    {

        return count == 0;

    }
    // Utility function to check if the queue is empty or not
    public Boolean isFull()
    {
        return count==capacity;
    }

}
class Main
{
    // main function
    public static void main (String[] args)
    {
        // create a queue of capacity 5
        QueueArray q = new QueueArray(5);

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);

        System.out.println("Front element is: " + q.peek());
        q.dequeue();
        System.out.println("Front element is: " + q.peek());

        System.out.println("Queue size is " + q.size());

        q.dequeue();
        q.dequeue();

        if (q.isEmpty())
            System.out.println("Queue Is Empty");
        else
            System.out.println("Queue Is Not Empty");
    }
}
