import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;

    }
}
class Binary{
    Node construct(){
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your data");
        int data = sc.nextInt();
        
        Node newNode = new Node(data);
        System.out.println("Do you Want to add Node at left side "+newNode.data);
        char ch = sc.next().charAt(0);
        if(ch=='y'){
            newNode.left = construct();
        }
        System.out.println("Do you Want to add Node at right side "+newNode.data);
        char ch1 = sc.next().charAt(0);
        if(ch1=='y'){
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
        System.out.print(root.data+" ");
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
    void levelorder(Node root){
        if(root==null){
            return;
        }
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
            }
            else{
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
        int leftNode = countNode(root.left);
        int rightNode = countNode(root.right);
        return leftNode+rightNode+1;
    }
    int sumofNode(Node root){
        if(root==null){
            return 0;
        }
        int leftsum = sumofNode(root.left);
        int rightsum = sumofNode(root.right);
        return leftsum+rightsum+root.data;
    }
    static int height(Node root){
        if(root==null){
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh,rh)+1;
    }
    int diameter(Node root){
        if(root==null){
            return 0;
        }
        int ld = diameter(root.left);
        int lh = height(root.left);
        int rd = diameter(root.right);
        
        int rh = height(root.right);
        int sd = lh+rh+1;
        return Math.max(sd,Math.max(ld,rd));
    }


}
class client{
    public static void main(String[] args) {
        Binary bt = new Binary();
        Node root = bt.construct();
        System.out.println("Preorder Traversal");
        bt.preorder(root);

        System.out.println("inorder Traversal");
        bt.inorder(root);

        System.out.println("Postorder Traversal");
        bt.postorder(root);

        System.out.println("levelorder Traversal");
        bt.levelorder(root);

        int count =bt.countNode(root);
        System.out.println("Toatal No of countNode is : "+count);
        int sum = bt.sumofNode(root);
        System.out.println("total sum of Node : "+sum);

        int hg =Binary.height(root);
        System.out.println("The height of the tree is : "+hg);

        int diam = bt.diameter(root);
        System.out.println("The diameter of a tree is : "+diam);


    }
}