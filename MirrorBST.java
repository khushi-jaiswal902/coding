/*build a binary search tree
public class BST {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }
    public static Node insert(Node root, int val) {
        if(root == null) {
            root = new Node(val);
            return root;
        }
        if (root.data > val) {
            //left subtree
            root.left = insert(root.left, val);
         } else {
            //right subtree
            root.right = insert(root.right, val);
        }
        return root;
    }
    public static void inorder(Node root) {
        if(root == null) {
            return;
        }
            inorder(root.left);
            System.out.print(root.data+"");
            inorder(root.right);
        }
    
    public static void main(String[] args) {
        int values[] = {5, 1, 3, 4, 2, 7};
        Node root = null;
        for(int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        inorder(root);
        System.out.println();
    }
}*/

/*search in BST
public class BST {

    // Node class
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    // Insert a value into BST
    public static Node insert(Node root, int val) {
        if (root == null) {
            return new Node(val);
        }

        if (val < root.data) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }

        return root;
    }

    // Inorder traversal (prints sorted order)
    public static void inorder(Node root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // Search a key in BST
    public static boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }

        if (root.data == key) {
            return true;
        }

        if (key < root.data) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
    }

    // Main method
    public static void main(String[] args) {
        int[] values = {5, 1, 3, 4, 2, 7};
        Node root = null;

        // Insert values into BST
        for (int val : values) {
            root = insert(root, val);
        }

        // Print inorder traversal
        System.out.print("Inorder Traversal: ");
        inorder(root);
        System.out.println();

        // Search key
        int key = 4;
        if (search(root, key)) {
            System.out.println("Key " + key + " found in BST");
        } else {
            System.out.println("Key " + key + " not found in BST");
        }
    }
}*/

/*delete a node
public class BST {

    // Node class
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    // Insert into BST
    public static Node insert(Node root, int val) {
        if (root == null) {
            return new Node(val);
        }

        if (val < root.data) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    // Inorder traversal
    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

     //Delete a node from BST
    public static Node delete(Node root, int key) {
        if (root == null) {
            return null;
        }

        if (key < root.data) {
            root.left = delete(root.left, key);
        } 
        else if (key > root.data) {
            root.right = delete(root.right, key);
        } 
        else {
            // Case 1: No child (leaf)
            if (root.left == null && root.right == null) {
                return null;
            }

            // Case 2: One child
            if (root.left == null) {
                return root.right;
            } 
            else if (root.right == null) {
                return root.left;
            }

            // Case 3: Two children
            Node inorderSuccessor = findMin(root.right);
            root.data = inorderSuccessor.data;
            root.right = delete(root.right, inorderSuccessor.data);
        }
        return root;
    }

    // Find minimum value node
    public static Node findMin(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    // Main method
    public static void main(String[] args) {
        int[] values = {5, 1, 3, 4, 2, 7};
        Node root = null;

        // Insert elements
        for (int val : values) {
            root = insert(root, val);
        }

        System.out.print("Inorder traversal: ");
        inorder(root);
        System.out.println();

        // Delete operation
        root = delete(root, 3);
        System.out.print("After deleting 3: ");
        inorder(root);
        System.out.println();
    }
}*/

/*print in range
public class BSTRange {

    // Node class
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    // Insert into BST
    public static Node insert(Node root, int val) {
        if (root == null) {
            return new Node(val);
        }

        if (val < root.data) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    // Print nodes in range [k1, k2]
    public static void printInRange(Node root, int k1, int k2) {
        if (root == null) {
            return;
        }

        // If current node is in range, print it
        if (root.data >= k1 && root.data <= k2) {
            printInRange(root.left, k1, k2);
            System.out.print(root.data + " ");
            printInRange(root.right, k1, k2);
        }
        // If current node is smaller than k1, ignore left subtree
        else if (root.data < k1) {
            printInRange(root.right, k1, k2);
        }
        // If current node is greater than k2, ignore right subtree
        else {
            printInRange(root.left, k1, k2);
        }
    }

    // Main method
    public static void main(String[] args) {
        int[] values = {5, 1, 3, 4, 2, 7};
        Node root = null;

        // Build BST
        for (int val : values) {
            root = insert(root, val);
        }

        int k1 = 2;
        int k2 = 5;

        System.out.print("Nodes in range [" + k1 + ", " + k2 + "]: ");
        printInRange(root, k1, k2);
        System.out.println();
    }
}*/

/*root to leaf path
import java.util.ArrayList;

public class BSTRootToLeaf {

    // Node class
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    // Insert into BST
    public static Node insert(Node root, int val) {
        if (root == null) {
            return new Node(val);
        }

        if (val < root.data) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    // Print all root to leaf paths
    public static void printRootToLeaf(Node root, ArrayList<Integer> path) {
        if (root == null) {
            return;
        }

        // Add current node to path
        path.add(root.data);

        // If leaf node, print the path
        if (root.left == null && root.right == null) {
            printPath(path);
        } else {
            // Recurse for left and right subtree
            printRootToLeaf(root.left, path);
            printRootToLeaf(root.right, path);
        }

        // Backtrack
        path.remove(path.size() - 1);
    }

    // Print a single path
    public static void printPath(ArrayList<Integer> path) {
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i));
            if (i != path.size() - 1) {
                System.out.print(" -> ");
            }
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        int[] values = {5, 1, 3, 4, 2, 7};
        Node root = null;

        // Build BST
        for (int val : values) {
            root = insert(root, val);
        }

        System.out.println("Root to Leaf Paths:");
        printRootToLeaf(root, new ArrayList<>());
    }
}*/

/*validate BST
public class ValidateBST {

    // Node class
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    // Insert into BST (for testing)
    public static Node insert(Node root, int val) {
        if (root == null) {
            return new Node(val);
        }

        if (val < root.data) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    // Validate BST using min-max range
    public static boolean isValidBST(Node root, long min, long max) {
        if (root == null) {
            return true;
        }

        if (root.data <= min || root.data >= max) {
            return false;
        }

        return isValidBST(root.left, min, root.data)
            && isValidBST(root.right, root.data, max);
    }

    // Wrapper function
    public static boolean isValidBST(Node root) {
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    // Main method
    public static void main(String[] args) {

        // Create BST
        int[] values = {5, 7, 3, 4, 2, 7};
        Node root = null;
        for (int val : values) {
            root = insert(root, val);
        }

        // Validate BST
        if (isValidBST(root)) {
            System.out.println("The tree is a valid BST");
        } else {
            System.out.println("The tree is NOT a valid BST");
        }
    }
}*/

//mirror a BST
public class MirrorBST {

    // Node class
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    // Insert into BST
    public static Node insert(Node root, int val) {
        if (root == null) {
            return new Node(val);
        }

        if (val < root.data) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    // Inorder traversal
    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // Mirror (invert) the BST
    public static Node mirror(Node root) {
        if (root == null) {
            return null;
        }

        // Recursively mirror left and right subtrees
        Node leftMirror = mirror(root.left);
        Node rightMirror = mirror(root.right);

        // Swap left and right
        root.left = rightMirror;
        root.right = leftMirror;

        return root;
    }

    // Main method
    public static void main(String[] args) {
        int[] values = {5, 1, 3, 4, 2, 7};
        Node root = null;

        // Build BST
        for (int val : values) {
            root = insert(root, val);
        }

        System.out.print("Inorder before mirror: ");
        inorder(root);
        System.out.println();

        // Mirror BST
        root = mirror(root);

        System.out.print("Inorder after mirror: ");
        inorder(root);
        System.out.println();
    }
}







    