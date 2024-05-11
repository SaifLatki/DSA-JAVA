class Node{
    int data;
    Node next;
    Node(int data){
        this.data= data;
        this.next=null;
    }
}

 interface List {
    public boolean isEmpty();
    public int size();
    public void addObjectAtEnd(int item);
    public void addIndex(int index,int  item);
    public void removeElement(int item);
    public void removeObject();
    public List duplicate();
    public Node duplicateReversed();

}


public class LinkedList implements List {
    Node head,current ;
    public LinkedList(){
        head=null;
    }
public void insertData(int data){
    Node n=new Node(data);
    if(head==null){
        head=n;
    }
    else {
        current=head;
        while(current.next!=null){
            current=current.next;
        }
        current.next=n;
    }
}


    @Override
    public boolean isEmpty() { //this methode returns true when list is empty otherwise false
        return head==null;
    }

    @Override
    public int size() { //this method check the size of list
        int size=0;
        current=head;
        while(current!=null){
            size++;
            current=current.next;
        }

        return size;
    }

    @Override
    public void addObjectAtEnd(int  item) { // this method add the new data at the end of list
        Node temp=new Node(item);
        if(head==null)
            head=temp;
        else {
            current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = temp;
        }
    }

    @Override
    public void addIndex(int index,int item) {
        Node temp=new Node(item);
        int count=0;
        current=head;
        if(index==0){
            Node new_node=new Node(item);
            new_node.next=head;
            head=new_node;
        }
        else {
            while (count<index-1){
                current=current.next;
                count++;
            }
            temp.next=current.next;
            current.next=temp;
        }

    }

    @Override
    public void removeElement( int item) {
        int value;
        current=head;

        while(current.next.data!=item){
            current=current.next;
        }
        current.next=current.next.next;
    }

    @Override
    public void removeObject() {
        head=head.next;
    }

    @Override
    public LinkedList duplicate() {
        LinkedList dup=new LinkedList();
        Node temp=head;
        while(temp.next!=null){
            dup.addObjectAtEnd(temp.data);
            temp=temp.next;
        }
        dup.addObjectAtEnd(temp.data);
        return dup;
    }

    @Override
    public Node duplicateReversed() {
        Node prev=null;
        Node current=head;
        while(current!=null){
            Node nextNode=current.next;
            current.next=prev;
            prev=current;
            current=nextNode;
        }
        head=prev;
        return head;
    }
    public void display(){
        Node curr=head;
        while(curr.next!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
        System.out.println(curr.data);
    }
    public static void main (String args[]){
        LinkedList l1=new LinkedList();
        l1.addObjectAtEnd(1);
        l1.addObjectAtEnd(2);
        l1.addObjectAtEnd(3);
        l1.addObjectAtEnd(4);
        l1.display();
        LinkedList l2=new LinkedList();
        l2=l1.duplicate();
        l2.display();
        LinkedList reversedList=new LinkedList();
        reversedList.head=l2.duplicateReversed();
        reversedList.display();
    }
}
