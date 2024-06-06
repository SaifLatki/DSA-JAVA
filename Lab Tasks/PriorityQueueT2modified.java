
class PriorityQueueModifiedT2
{
    int arr[];
    int capacity =10;
    int size =0;
    int maxIndex=0;

    public PriorityQueueModifiedT2() {
        // initialize an array
        arr= new int[capacity];


    }
    public void insert(int data) {
        // insert data in array in any order
        // handle all possible exceptions/errors
        if(size==capacity){
            System.out.println("PQ full ");
            return ;
        }
//        if(size==0 && data>arr[maxIndex]){
//            maxIndex=size;
//        }

     int i=size-1;
        while(i>=0 && arr[i]>data){
            arr[i+1]=arr[i];
            i--;
        }
        arr[i+1]=data;
        size++;

    }

    public int extractMax() {
        // return and remove max value from array
        // handle all possible exceptions/errors
        if(size ==0){
            System.out.println("Queue is Empty Don't Extract anymore element");
        }

        int max=arr[maxIndex];
        arr[maxIndex]=arr[size-1];
        size--;
        if(size==0){
            maxIndex=-1;
        }
        else {
            maxIndex=0;
            for (int j =1; j < size; j++) {
                if(arr[j]>arr[maxIndex]){
                    maxIndex=j;
                }

            }
        }

        return max;
    }

    public int getMax() {
        // just return max value from array
        // handle all possible exceptions/errors
        int max=0;
        for (int i = 0; i< size; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    public boolean searchData(int data) {
        // search data from array
        // handle all possible exceptions/error
        for(int k = 0; k< size; k++){
            if(data==arr[size]){
                return true;
            }
        }
        return false;
    }
    public void display(){
        for (int i = 0; i< size; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args)
    {
        // Test the main method by creating object for PriorityQueueUsingArray class
        PriorityQueueModifiedT2 q1=new PriorityQueueModifiedT2();

        // insert some values using insert method
        q1.insert(1);
        q1.insert(2);
        q1.insert(3);
        q1.insert(4);
        q1.insert(5);
        q1.insert(6);
        q1.insert(7);
        q1.insert(8);
        q1.insert(9);
        q1.insert(10);

        q1.display();
        // call extractMax method and print output
        System.out.println("ExtractMax: "+q1.extractMax());
        System.out.println("ExtractMax: " + q1.extractMax());
        q1.display();


        // call extractMax method and print output

       System.out.println("ExtractMax: " + q1.extractMax());

      q1.display();
        // call getMax method and print output
        System.out.println("GetMax: "+q1.getMax());
        q1.display();
        // call extractMax method and print output
       System.out.println("ExtractMax: "+q1.extractMax());
        // insert some values using insert method
        q1.insert(18);
        q1.insert(13);
        q1.display();

    }
}   
