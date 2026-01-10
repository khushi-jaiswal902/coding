/*kth-level-in-binary-tree
public class BT3 {
    static class Node {
        int data;
        Node left, right;
        Node(int item) {
            data = item;
            left = right = null;
        }
    }
    Node root;
    void printKthLevel(Node root, int k) {
        if (root == null)
            return;
        if (k == 1) {
            System.out.print(root.data + " ");
            return;
        }
        printKthLevel(root.left, k - 1);
        printKthLevel(root.right, k - 1);
    }
    public static void main(String args[]) {
        BT3 tree = new BT3();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        System.out.println("Nodes at level 3:");
        tree.printKthLevel(tree.root, 3);
    }
}*/

/*lowest common ancestor in binary tree
public class BT3 {
    static class Node {
        int data;
        Node left, right;   
        Node(int item) {
            data = item;
            left = right = null;
        }
    }       
    Node root;
    Node findLCA(Node root, int n1, int n2) {
        if (root == null)
            return null;
        if (root.data == n1 || root.data == n2)
            return root;
        Node left_lca = findLCA(root.left, n1, n2);
        Node right_lca = findLCA(root.right, n1, n2);
        if (left_lca != null && right_lca != null)
            return root;
        return (left_lca != null) ? left_lca : right_lca;
    }
    public static void main(String args[]) {
        BT3 tree = new BT3();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        int n1 = 4, n2 = 5;
        Node t = tree.findLCA(tree.root, n1, n2);
        System.out.println("LCA of " + n1 + " and " + n2 + " is " + t.data);
    }
}*/

/*minimum distance between two nodes in binary tree
public class BT3 {
    static class Node {
        int data;
        Node left, right;   
        Node(int item) {
            data = item;    
            left = right = null;
        }
    }       
    Node root;
    Node findLCA(Node root, int n1, int n2) {
        if (root == null)
            return null;
        if (root.data == n1 || root.data == n2)
            return root;
        Node left_lca = findLCA(root.left, n1, n2);
        Node right_lca = findLCA(root.right, n1, n2);
        if (left_lca != null && right_lca != null)
            return root;
        return (left_lca != null) ? left_lca : right_lca;
    }
    int findLevel(Node root, int k, int level) {
        if (root == null)
            return -1;
        if (root.data == k)
            return level;
        int left = findLevel(root.left, k, level + 1);
        if (left != -1)
            return left;
        return findLevel(root.right, k, level + 1);
    }
    int findDistance(int n1, int n2) {
        Node lca = findLCA(root, n1, n2);
        int d1 = findLevel(lca, n1, 0);
        int d2 = findLevel(lca, n2, 0);
        return d1 + d2;
    }
    public static void main(String args[]) {
        BT3 tree = new BT3();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        int n1 = 4, n2 = 5;
        System.out.println("Distance between " + n1 + " and " + n2 + " is " + tree.findDistance(n1, n2));
    }
}*/

/*kth ancestor of a node in binary tree
public class BT3 {
    static class Node {
        int data;
        Node left, right;
        Node(int item) {
            data = item;
            left = right = null;
        }
    }
    Node root;
    int k;
    Node kthAncestorUtil(Node root, int node) {
        if (root == null)
            return null;
        if (root.data == node)
            return root;            
        Node left_lca = kthAncestorUtil(root.left, node);
        Node right_lca = kthAncestorUtil(root.right, node);
        if (left_lca != null && right_lca != null) {
            return root;
        }
        if (left_lca != null) {
            k--;
            if (k == 0) {
                System.out.println("Kth Ancestor is: " + root.data);
                return null;
            }
            return left_lca;
        }
        if (right_lca != null) {    
            k--;
            if (k == 0) {
                System.out.println("Kth Ancestor is: " + root.data);
                return null;
            }
            return right_lca;
        }
        return null;
    }
    void kthAncestor(int node, int k) {
        this.k = k;
        Node res = kthAncestorUtil(root, node);
        if (res != null && res.data != node) {
            System.out.println("Kth Ancestor does not exist");
        }
    }
    public static void main(String args[]) {
        BT3 tree = new BT3();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        int node = 5, k = 2;
        tree.kthAncestor(node, k);
    }
}*/

//Transform to sum tree
/*public class BT3 {
    static class Node {
        int data;
        Node left, right;   
        Node(int item) {
            data = item;
            left = right = null;
        }
    }       
    Node root;
    int toSumTree(Node node) {
        if (node == null)
            return 0;
        int old_val = node.data;
        node.data = toSumTree(node.left) + toSumTree(node.right);
        return node.data + old_val;
    }
    void printInorder(Node node) {
        if (node == null)
            return;
        printInorder(node.left);
        System.out.print(node.data + " ");
        printInorder(node.right);
    }
    public static void main(String args[]) {
        BT3 tree = new BT3();
        tree.root = new Node(10);
        tree.root.left = new Node(-2);
        tree.root.right = new Node(6);
        tree.root.left.left = new Node(8);
        tree.root.left.right = new Node(-4);
        tree.root.right.left = new Node(7);
        tree.root.right.right = new Node(5);
        tree.toSumTree(tree.root);
        System.out.println("Inorder traversal of the resultant tree is:");
        tree.printInorder(tree.root);
    }
}*/

