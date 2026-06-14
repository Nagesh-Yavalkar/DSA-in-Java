import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node{
    int data;
    Node left = null;
    Node right = null;
    Node(int data){
        this.data = data;
    }
}
class Binary{
    Node construct(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your data ");
        int data = sc.nextInt();
        
        Node newNode = new Node(data);
        System.out.println("Do you add left Node : "+newNode.data);
        char leftNode= sc.next().charAt(0);
        if(leftNode=='y'||leftNode=='Y'){
            newNode.left = construct();
        }
        System.out.println("Do you add Node at right side : "+newNode.data);
        char rightNode = sc.next().charAt(0);
        if(rightNode=='y'||rightNode=='Y'){
            newNode.right = construct();
        }
        return newNode;


    }
    void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);


    }
     void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);

        System.out.print(root.data+" ");
        
        inorder(root.right);


    }
     void postorder(Node root){
        if(root==null){
            return;
        }
        
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");


    }
    void levelorder(Node root){
        if(root==null)
            return;
        Queue<Node> que = new LinkedList<>();
        que.add(root);
        que.add(null);
        while(!que.isEmpty()){
            Node tempNode = que.remove();
            if(tempNode==null){
                System.out.println();
                if(que.isEmpty()){
                    break;

                }else{
                    que.add(null);
                }

            }else{
                System.out.print(tempNode.data+" ");
                if(tempNode.left!=null){
                que.add(tempNode.left);
            }
            if(tempNode.right!=null){
                que.add(tempNode.right);
            }

            }
        }
    }
    int countNode(Node root){
        if(root==null){
            return 0;
        }
        int leftcount = countNode(root.left);
        int rightcount = countNode(root.right);
        return leftcount+rightcount+1;

    }
    int sumofNode(Node root){
        if(root==null){
            return 0;
        }
        int leftcount = sumofNode(root.left);
        int rightcount = sumofNode(root.right);
        return leftcount+rightcount+root.data;

    }
    int height(Node root){
        if(root==null){
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh,rh)+1;
    }
    

}
class client{
    public static void main(String[] args) {
        Node root = null;
        Binary bt = new Binary();
        
       
        root = bt.construct();
        System.out.println("Preorder traversal : ");
        bt.preorder(root);
        System.out.println();
        System.out.println("Inorder Traversal : ");
        bt.inorder(root);
        System.out.println();
        System.out.println("Postorder Traversal : ");
        bt.postorder(root);
        System.out.println();
        

        int count = bt.countNode(root);
        System.out.println("Number of node is "+count);

        int sum = bt.sumofNode(root);
        

        System.out.println("the sum of Node is : "+sum);
        int height = bt.height(root);

        System.err.println("height of the tree : "+height);
        
    }
}