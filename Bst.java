import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node{
    Node left = null;
    Node right = null;
    int data;
    Node(int data){
        this.data = data;
    }
}
class Binary{
    Node insertintobst(Node root,int data){
        if(root==null){
            Node newNode = new Node(data);
            root = newNode;
            return root;

        }
        if(root.data<data){
            root.right = insertintobst(root.right, data);
        }
        if(root.data>data){
            root.left = insertintobst(root.left,data);
        }
        return root;
    }
    boolean searchele(Node root,int data){
        if(root==null){
            return false;
        }
        if(root.data==data){
            return true;
        }
        if(root.data>data){
            return searchele(root.left, data);
        }
        return searchele(root.right, data);
    }
    Node delefrombst(Node root,int data){
        if(root==null){
            return root;
        }
        if(root.data>data){
        root.left = delefrombst(root.left, data);
        }
        else if(root.data<data){
        root.right = delefrombst(root.right, data);
        }else{
            if(root.left==null&&root.right==null){
                return null;
            }
            if(root.left!=null&&root.right==null){
                return root.left;
            }
            if(root.left==null&&root.right!=null){
                return root.right;
            }
            if(root.left!=null&&root.right.right!=null){

            
            
                Node tempNode = maxNode(root.left);
                root.data = tempNode.data;
                root.left = delefrombst(root.left, tempNode.data);

            }
            

        }return root;
    }
    
    Node minNode(Node root){
        while(root.left!=null){
            root = root.left;
            
        }
        return root;

    }
    Node maxNode(Node root){
        while(root.right!=null){
            root = root.right;
        }
        return root;
    }
    void preorder(Node root){
        if(root ==null){
            
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
        Queue<Node> que = new LinkedList<Node>();
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

}
class client{
    public static void main(String[] args) {
        Node root = null;
        Binary bt = new Binary();
        Scanner sc = new Scanner(System.in);
        char ch;
        do{
            System.out.println("1. insertIntobst");
            System.out.println("2. searchintobst");
            System.out.println("3. deletefrombst");
            System.out.println("4. minNodeBst");
            System.out.println("5. maxNodebst");
            System.out.println("6. preorder");
            System.out.println("7. postorder");
            System.out.println("8. inorder");
            System.out.println("9. levelorder");
            System.out.println("Enter your choice : ");
            int choice = sc.nextInt();
            switch(choice){
                case 1:{
                    System.out.println("Enter your data : ");
                    int data = sc.nextInt();
                    root = bt.insertintobst(root,data);

                }
                break;
                case 2:{
                    System.out.println("Enter your search Element in tree : ");
                    int ele = sc.nextInt();
                    if(bt.searchele(root,ele)){
                        System.out.println("element is found");
                    }else{
                        System.out.println("element is not found");
                    }

                }
                break;
                case 3:{

                }
                break;
                case 4:{
                    if(root!=null){
                        Node sNode =bt.minNode(root);
                        System.out.println("Minimum Node is "+sNode.data);

                    }else{
                        System.out.println("tree is empty");
                    }

                }
                break;
                case 5:{
                    if(root!=null){
                        Node sNode = bt.maxNode(root);
                        System.out.println("maximum Node is "+sNode.data);
                    }else{
                        System.out.println("tree is empty");
                    }

                }
                break;
                case 6:{
                    bt.preorder(root);
                    System.out.println();

                }
                break;
                case 7:{
                    bt.postorder(root);
                    System.out.println();

                }
                break;
                case 8:{
                    bt.inorder(root);
                    System.out.println();

                }
                break;
                case 9:{
                    bt.levelorder(root);
                    System.out.println();

                }
                break;
                default:{
                    System.out.println("wrong choice ");
                }
            }System.out.println("Do you Want to continue ");
            ch = sc.next().charAt(0);
            

        }while(ch=='y'||ch=='Y');
        sc.close();
    }
}