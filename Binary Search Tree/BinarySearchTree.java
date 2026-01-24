public class BinarySearchTree {

    //Create a node class with data, left pointer and right pointer.
    class Node {
        int data;
        Node left;
        Node right;

        //Constructor of the Node class
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    //Initialized the Node
    Node root;

    //Constructor of the Binary Tree class
    public BinarySearchTree(){
        root = null;
    }


    //--------------------------------INSERT DATA IN BINARY TREE-------------------------------------------

    public void insertData(int data){
        root = insertRecursive(root, data);
    }

    private BinarySearchTree.Node insertRecursive(Node root, int data){
        if(root == null){
            root = new Node(data);
            return root;
        }

        if(data < root.data){
            root.left = insertRecursive(root.left, data);
        } else if (data > root.data){
            root.right = insertRecursive(root.right, data);
        }

        return root;
    }

    //--------------------------------INORDER TRAVERSAL IN BINARY TREE-------------------------------------------

    public void inorderTraversal(){
        inorderRecursive(root);
        System.out.println();
    }

    private void inorderRecursive(Node root){
        if(root != null){
            inorderRecursive(root.left);
            System.out.print(root.data + " ");
            inorderRecursive(root.right);
        }
    }

    //--------------------------------PREORDER TRAVERSAL IN BINARY TREE-------------------------------------------

    public void preorderTraversal(){
        preorderRecursive(root);
        System.out.println();
    }

    private void preorderRecursive(Node root){
        if(root != null){
            System.out.print(root.data + " ");
            preorderRecursive(root.left);
            preorderRecursive(root.right);
        }
    }

    //--------------------------------POSTORDER TRAVERSAL IN BINARY TREE-------------------------------------------

    public void postorderTraversal(){
        postorderTraversalRecursive(root);
        System.out.println();
    }

    private void postorderTraversalRecursive(Node root){
        if(root != null){
            postorderTraversalRecursive(root.left);
            postorderTraversalRecursive(root.right);
            System.out.print(root.data + " ");
        }
    }

    //--------------------------------DELETION IN BINARY TREE-------------------------------------------
    
    public void delete(int data){
        root = deleteRecursive(root, data);
    }

    private BinarySearchTree.Node deleteRecursive(Node root, int data){
        if(root == null){
            return root;
        }

        if(data < root.data){
            root.left = deleteRecursive(root.left, data);
        }
        else if(data > root.data){
            root.right = deleteRecursive(root.right, data);
        } else {
            if( root.left == null){
                return root.right;
            }else if (root.right == null){
                return root.left;
            }

            root.data = minValue(root.right);
            root.right = deleteRecursive(root.right, root.data);
        }

        return root;
    }

    private int minValue(BinarySearchTree.Node right){
        int min = root.data;
        while(root.left != null){
            min = root.left.data;
            root = root.left;
        }

        return min;
    }


    //--------------------------------MAIN FUNCTION-------------------------------------------

    public static void main(String[] args) {
        BinarySearchTree bt = new BinarySearchTree();
        bt.insertData(2);
        bt.insertData(1);
        bt.insertData(3);
        bt.inorderTraversal();
        bt.preorderTraversal();
        bt.postorderTraversal();
    }
}
