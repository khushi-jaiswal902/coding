
/*Binary Tree Implementation
public class BT1 {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class BinaryTree {
        static int idx = -1;
        public static Node buildTree(int nodes[]) {
            idx++;
            if(nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }
    public static void main(String args[]) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);  //1
        System.out.println(root.left.data); //2
        System.out.println(root.right.data); //3        
    }
}*/

/*preorder traversal
public class BT1 {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class BinaryTree {
        static int idx = -1;
        public static Node buildTree(int nodes[]) {
            idx++;
            if(nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }

        public static void preorder(Node root) {
            if(root == null) {
                return;
            }
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }
    public static void main(String args[]) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        tree.preorder(root);  //1 2 4 5 3 6      
    }
}*/

/*inorder traversal
public class BT1 {
    static class Node {
        int data;
        Node left;
        Node right;     
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class BinaryTree {
        static int idx = -1;
        public static Node buildTree(int nodes[]) {
            idx++;
            if(nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;                                                                         
        }   
        public static void inorder(Node root) {
            if(root == null) {
                return;
            }
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }
    public static void main(String args[]) {
        int nodes[] = {1,2,4,-1,-1,5,-1 ,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        tree.inorder(root);  //4 2 5 1 3 6      
    }
}*/

/*postorder traversal
public class BT1 {
    static class Node {
        int data;
        Node left;
        Node right; 
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class BinaryTree {
        static int idx = -1;
        public static Node buildTree(int nodes[]) {
            idx++;
            if(nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;                                                                         
        }   
        public static void postorder(Node root) {
            if(root == null) {
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }
    }
    public static void main(String args[]) {
        int nodes[] = {1,2,4,-1,-1,5,-1 ,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        tree.postorder(root);  //4 5 2 6 3 1      
    }
}*/

/*level order traversal
import java.util.*;
public class BT1 {
    static class Node {
        int data;
        Node left;
        Node right; 
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class BinaryTree {
        static int idx = -1;
        public static Node buildTree(int nodes[]) {
            idx++;
            if(nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;                                                                         
        }   
        public static void levelOrder(Node root) {
            if(root == null) {
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);    
            while(!q.isEmpty()) {
                Node currNode = q.remove();
                if(currNode == null) {
                    System.out.println();
                    if(q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    System.out.print(currNode.data + " ");
                    if(currNode.left != null) {
                        q.add(currNode.left);
                    }
                    if(currNode.right != null) {
                        q.add(currNode.right);
                    }
                }
            }
        }
    }
    public static void main(String args[]) {
        int nodes[] = {1,2,4,-1,-1,5,-1 ,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        tree.levelOrder(root);  
        /*1 
        2 3 
        4 5 6       
    }
}  */

    /*height of tree
public class BT1 {
    static class Node {
        int data;
        Node left;
        Node right; 
        Node(int data) {    
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class BinaryTree {
        static int idx = -1;
        public static Node buildTree(int nodes[]) {
            idx++;
            if(nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;                                                                        
        }   
        public static int height(Node root) {
            if(root == null) {
                return 0;
            }
            int leftHeight = height(root.left);
            int rightHeight = height(root.right);
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }
    public static void main(String args[]) {
        int nodes[] = {1,2,4,-1,-1,5,-1 ,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println("Height of tree: " + tree.height(root));  //Height of tree: 3     
    }
}*/

/*count of nodes
public class BT1 {
    static class Node {
        int data;
        Node left;
        Node right; 
        Node(int data) {    
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class BinaryTree {
        static int idx = -1;
        public static Node buildTree(int nodes[]) {
            idx++;
            if(nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);    
            newNode.right = buildTree(nodes);
            return newNode;                                                                        
        }   
        public static int countNodes(Node root) {
            if(root == null) {
                return 0;
            }
            int leftCount = countNodes(root.left);
            int rightCount = countNodes(root.right);        
            return leftCount + rightCount + 1;
        }
    }
    public static void main(String args[]) {
        int nodes[] = {1,2,4,-1,-1,5,-1 ,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println("Count of nodes: " + tree.countNodes(root));  //Count of nodes: 6     
    }
}*/

/*sum of nodes
public class BT1 {
    static class Node {
        int data;
        Node left;
        Node right; 
        Node(int data) {    
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class BinaryTree {
        static int idx = -1;
        public static Node buildTree(int nodes[]) {
            idx++;  
            if(nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;                                                                        
        }   
        public static int sumOfNodes(Node root) {
            if(root == null) {
                return 0;
            }
            int leftSum = sumOfNodes(root.left);
            int rightSum = sumOfNodes(root.right);        
            return leftSum + rightSum + root.data;
        }
    }
    public static void main(String args[]) {
        int nodes[] = {1,2,4,-1,-1,5,-1 ,-1,3,-1,6,-1,-1};
        BinaryTree tree = new Binary Tree();
        Node root = tree.buildTree(nodes);
        System.out.println("Sum of nodes: " + tree.sumOfNodes(root));  //Sum of nodes: 21     
    }
}*/

//diameter of tree
public class BT1 {
    static class Node {
        int data;
        Node left;
        Node right; 
        Node(int data) {    
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class BinaryTree {
        static int idx = -1;
        public static Node buildTree(int nodes[]) {
            idx++;
            if(nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;                                                                        
        }   
        public static int height(Node root) {
            if(root == null) {
                return 0;
            }
            int leftHeight = height(root.left);
            int rightHeight = height(root.right);
            return Math.max(leftHeight, rightHeight) + 1;
        }       
        public static int diameter(Node root) {
            if(root == null) {
                return 0;
            }
            int leftDiameter = diameter(root.left);
            int rightDiameter = diameter(root.right);
            int leftHeight = height(root.left);
            int rightHeight = height(root.right);
            int selfDiameter = leftHeight + rightHeight + 1;
            return Math.max(selfDiameter, Math.max(leftDiameter, rightDiameter));
        }
    }
    public static void main(String args[]) {
        int nodes[] = {1,2,4,-1,-1,5,-1 ,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println("Diameter of tree: " + tree.diameter(root));  //Diameter of tree: 5     
    }
}   

