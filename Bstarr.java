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
    int index = -1;
    Node preorderTreeNode(int arr[]){
        index++;
        if(arr[index]==-1){
            return null;
        }
        Node newNode = new Node(arr[index]);
        newNode.left = preorderTreeNode(arr);
        newNode.right = preorderTreeNode(arr);
        return newNode;
        
        
    }
    void preorder(Node root){
        if(root==null)
            return;
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
}
class client{
    public static void main(String[] args) {
        int arr[] = new int[]{1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Binary bt = new Binary();
        Node root = bt.preorderTreeNode(arr);
        bt.preorder(root);
    }
}