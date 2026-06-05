import java.util.Scanner;

class Node{
    int data;
    Node left = null;
    Node right = null;
    Node(int data){
        this.data = data;

    }
}
class Binaray{
    Node construct(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter lyour data");
        int data = sc.nextInt();
        Node newNode = new Node(data);
        System.out.println("Do you want to add node at lhs of "+newNode.data);
        char left = sc.next().charAt(0);
        if(left=='y'|| left=='Y'){
            newNode.left= construct();
        }
        System.out.println("Do you want to add node at rhs of "+newNode);
        char right = sc.next().charAt(0);
        if(right=='y'|| right =='Y'){
            newNode.right = construct();
        }
        return newNode;

    }
    void preorder(Node root){
        if(root==null){
            return ;
        }
        System.out.print(root.data);
        preorder(root.left);
        preorder(root.right);
    }
        void postorder(Node root){
        if(root==null){
            return ;
        }
        
        preorder(root.left);
        preorder(root.right);
        System.out.print(root.data);
    }
        void inorder(Node root){
        if(root==null){
            return ;
        }
        preorder(root.left);
        System.out.print(root.data);
        
        preorder(root.right);
    }
}
class client{
    public static void main(String[] args) {
        Node root = null;
        Binary bt = new Binary();
        root = bt.construct();
        bt.preorder(root);
        System.out.println();
        bt.postorder(root);
        System.out.println();
        bt.inorder(root);
    }
}