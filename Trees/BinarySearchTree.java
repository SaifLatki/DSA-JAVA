class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class BinarySearchTree {
    Node root;

    BinarySearchTree(Node root){
        this.root=root;
    }
    public Node insertNode(Node root ,int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }
        if (data < root.data) {
            root.left = insertNode(root.left,data);
        } else if (data > root.data) {
            root.right=insertNode(root.right,data);
        }
        return root;
    }

    public Node findTheNode(Node root, int key) {
        if (root.data == key) {
            return root;
        }

        else if (root.data > key) {
            if (root.left!=null){
                return findTheNode(root.left, key);
            }
            return root;
        }
        else{
            if(root.right!=null){
                return findTheNode(root.right, key);
            }

        return root;
        }
    }
    public Node deleteNode(Node root,int data){
        if(root==null){
            return root;
        }
        if(data<root.data){
            root.left=deleteNode(root.left,data);
            return root;
        }
        else if(data> root.data){
            root.right=deleteNode(root.right,data);
            return root;
        }
        else if (root.left==null) {
            Node temp= root.right;
            return temp;
        } else if (root.right==null) {
            Node temp= root.left;
            return temp;
        }
    return root;
    }


    public void display(Node root) {
        if (root == null) {
            return;
        }
        display(root.left);
        System.out.print(root.data + " ");
        display(root.right);
    }

    public static void main(String[] args) {
        Node root=new Node(6);
        BinarySearchTree b = new BinarySearchTree(root);
        b.insertNode(root,4);
        b.insertNode(root,7);
        b.insertNode(root,5);
        b.insertNode(root,3);
        b.insertNode(root,2);
        System.out.println("Before deleting ");
        b.display(b.root);
        //    System.out.println("find= " + b.findTheNode(b.root,1).data);
        System.out.println();
        System.out.println("After deleting ");
        b.deleteNode(root,7);
        b.display(b.root);
    }
}
