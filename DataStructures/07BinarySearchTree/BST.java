// BST -> insert , search and delete

public class BST {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node insert(Node root, int val) {
        if(root == null) {
            root = new Node(val);
            return root;
        }
        if(root.data > val) {
            root.left = insert(root.left, val);
        }
        else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void inorder(Node root) {
        if(root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static boolean search(Node root, int key) { // O(H)
        if(root == null) {
            return false;
        }
        if(root.data == key) {
            return true;
        }
        if(root.data > key) {
            return search(root.left, key);
        }
        else {
            return search(root.right, key);
        }
    }

    public static Node delete(Node root, int key) {
        if(root.data > key) {
            root.left = delete(root.left, key);
        }
        else if(root.data < key) {
            root.right = delete(root.right, key);
        }
        else {
            // case1 - leaf node
            if(root.left == null && root.right == null) {
                return null;
            }
            // case2 - one child
            if(root.left == null) {
                return root.right;
            }
            else if(root.right == null) {
                return root.left;
            }
            // case3 - two child
            Node inorder = findInorderSuccessor(root.right);
            root.data = inorder.data;
            root.right = delete(root.right, inorder.data);
        }
        return root;
    }

    public static Node findInorderSuccessor(Node root) {
        while(root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static void main(String[] args) {
        int values[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;

        for(int i=0; i<values.length; i++) {
            root = insert(root, values[i]);
        }
        inorder(root);
        System.out.println();

        // if(search(root, 1)) {
        //     System.out.println("found");
        // }
        // else {
        //     System.out.println("not found");
        // }

        System.out.println(delete(root, 5));
        inorder(root);
    }
}