package trees;

public class Node {
    int data;
    Node left, right;

    Node(int value){
        data= value;
        left=right=null;
    }
}
class BST{
    Node root;

    public void insert(int value){
        root=insertRec(root,value);
    }

    private Node insertRec(Node root, int value) {
        if(root==null)
        return root;
        return root;
    }
}
