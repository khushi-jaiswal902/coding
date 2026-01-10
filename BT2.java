/*subtree of another tree
public class BT2 {
    static class Node {
        int data;
        Node left, right;   
        Node(int item) {
            data = item;
            left = right = null;
        }
    }       
    Node root1, root2;   
    boolean areIdentical(Node root1, Node root2) {
        if (root1 == null && root2 == null)
            return true;
        if (root1 == null || root2 == null)
            return false;
        return (root1.data == root2.data && 
                areIdentical(root1.left, root2.left) && 
                areIdentical(root1.right, root2.right));
    }   
    boolean isSubtree(Node T, Node S) {
        if (S == null)
            return true;
        if (T == null)
            return false;
        if (areIdentical(T, S))
            return true;
        return isSubtree(T.left, S) || isSubtree(T.right, S);
    }   
    public static void main(String args[]) {
        BT2 tree = new BT2();
        tree.root1 = new Node(26);
        tree.root1.right = new Node(3);
        tree.root1.right.right = new Node(3);
        tree.root1.left = new Node(10);
        tree.root1.left.left = new Node(4); 
        tree.root1.left.left.right = new Node(30);
        tree.root1.left.right = new Node(6);
        tree.root2 = new Node(10);
        tree.root2.left = new Node(4);
        tree.root2.left.right = new Node(30);
        tree.root2.right = new Node(6);
        if (tree.isSubtree(tree.root1, tree.root2))
            System.out.println("Tree 2 is subtree of Tree 1");
        else
            System.out.println("Tree 2 is not a subtree of Tree 1");
    }
}*/

//top view of tree
import java.util.*;
class BT2 {
    static class Node {
        int data;
        Node left, right;   
        Node(int item) {
            data = item;
            left = right = null;        
        }
    }       
    Node root;   
    static class QueueObj {
        Node node;  
        int hd;   
        QueueObj(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }   
    void topView(Node root) {   
        class Pair {
            Node node;
            int hd;
            Pair(Node n, int h) {
                node = n;
                hd = h;
            }
        }       
        Queue<Pair> q = new LinkedList<>();
        Map<Integer, Integer> map = new TreeMap<>();
        if (root == null)
            return;       
        q.add(new Pair(root, 0));       
        while (!q.isEmpty()) {
            Pair temp = q.poll();
            Node node = temp.node;
            int hd = temp.hd;           
            if (!map.containsKey(hd)) {
                map.put(hd, node.data);
            }           
            if (node.left != null) {
                q.add(new Pair(node.left, hd - 1));
            }           
            if (node.right != null) {
                q.add(new Pair(node.right, hd + 1));
            }
        }       
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.print(entry.getValue() + " ");
        }
    }   
    public static void main(String args[]) {
        BT2 tree = new BT2();   
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.right = new Node(4);
        tree.root.left.right.right = new Node(5);
        tree.root.left.right.right.right = new Node(6);       
        System.out.println("Top view of the given binary tree:");
        tree.topView(tree.root);
    }
}