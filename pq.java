/*import java.util.*;
public class pq {
    public static void main(String[] args) {
        // Create a priority queue
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Add elements to the priority queue
        pq.add(5);
        pq.add(1);
        pq.add(3);
        pq.add(4);
        pq.add(2);

        // Poll elements from the priority queue
        while (!pq.isEmpty()) {
            System.out.println(pq.peek());
            pq.remove();
        }
    }
}*/

/*reverse order
import java.util.*;
public class pq {
    public static void main(String[] args) {
        // Create a priority queue
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        // Add elements to the priority queue
        pq.add(5);
        pq.add(1);
        pq.add(3);
        pq.add(4);
        pq.add(2);

        // Poll elements from the priority queue
        while (!pq.isEmpty()) {
            System.out.println(pq.peek());
            pq.remove();
        }
    }
}*/

/*PQ for objects
import java.util.*;
public class pq {
    static class Student implements Comparable<Student> {
        int marks;
        String name;  

        Student(String name, int marks) {
            this.name = name;
            this.marks = marks;
        }

        @Override
        public int compareTo(Student s2) {
            return this.marks - s2.marks; //ascending order
        }
    }
    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>();

        pq.add(new Student("A", 100));
        pq.add(new Student("B", 50));
        pq.add(new Student("C", 75));
        pq.add(new Student("D", 85));

        while(!pq.isEmpty()) {
            System.out.println(pq.peek().name + " : " + pq.peek().marks);
            pq.remove();
        }
    }
}*/

//heap
//binary tree
//complete binary tree
//min heap -> parent < left child && parent < right child
//max heap -> parent > left child && parent > right child

//(node) idx = i
//left child idx = 2*i + 1
//right child idx = 2*i + 2
//parent idx = (i-1)/2

/*insert in heap
import java.util.*;
public class pq {
    static class MinHeap {
        ArrayList<Integer> arr = new ArrayList<>(); //dynamic array
        public void add(int data) {
            //add at last idx
            arr.add(data);

            //up-heapify
            int x = arr.size() - 1; //child idx
            int par = (x - 1) / 2; //parent idx

            while (x > 0 && arr.get(x) < arr.get(par)) {
                //swap
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);

                x = par;
                par = (x - 1) / 2;
            }
        }
        public int peek() {
            return arr.get(0);
        }
        public int remove() {
            int data = arr.get(0);
            //step1: swap first and last
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size() - 1));
            arr.set(arr.size() - 1, temp);
            //step2: remove last
            arr.remove(arr.size() - 1);
            //step3: down-heapify
            downHeapify(0);
            return data;
        }
        private void downHeapify(int par) {
            int left = 2 * par + 1;
            int right = 2 * par + 2;
            int minIdx = par;
            if (left < arr.size() && arr.get(minIdx) > arr.get(left)) {
                minIdx = left;
            }
            if (right < arr.size() && arr.get(minIdx) > arr.get(right)) {
                minIdx = right;
            }
            if (minIdx != par) {
                //swap
                int temp = arr.get(minIdx);
                arr.set(minIdx, arr.get(par));
                arr.set(par, temp);
                downHeapify(minIdx);
            }
        }
    }
    public static void main(String[] args) {
        MinHeap pq = new MinHeap();
        pq.add(5);
        pq.add(1);
        pq.add(3);
        pq.add(4);
        pq.add(2);
        while (!pq.arr.isEmpty()) {
            System.out.println(pq.peek());
            pq.remove();
        }
    }
}*/

/*remove from heap
import java.util.*;
public class pq {
    static class MinHeap {
        ArrayList<Integer> arr = new ArrayList<>(); //dynamic array
        public void add(int data) {
            //add at last idx
            arr.add(data);
            //up-heapify
            int x = arr.size() - 1; //child idx
            int par = (x - 1) / 2; //parent idx     
            while (x > 0 && arr.get(x) < arr.get(par)) {
                //swap
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);
                x = par;
                par = (x - 1) / 2;
            }
        }
        public int peek() {
            return arr.get(0);
        }
        public int remove() {
            int data = arr.get(0);      
            //step1: swap first and last
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size() - 1));
            arr.set(arr.size() - 1, temp);
            //step2: remove last    
            arr.remove(arr.size() - 1);
            //step3: down-heapify
            downHeapify(0);   
            return data;
        }
        private void downHeapify(int par) {
            int left = 2 * par + 1;         
            int right = 2 * par + 2;
            int minIdx = par;
            if (left < arr.size() && arr.get(minIdx) > arr.get(left)) {
                minIdx = left;
            }
            if (right < arr.size() && arr.get(minIdx) > arr.get(right)) {
                minIdx = right;
            }
            if (minIdx != par) {
                //swap
                int temp = arr.get(minIdx);
                arr.set(minIdx, arr.get(par));
                arr.set(par, temp);
                downHeapify(minIdx);
            }
        }       
    }
    public static void main(String[] args) {
        MinHeap pq = new MinHeap();
        pq.add(5);      
        pq.add(1);
        pq.add(3);
        pq.add(4);
        pq.add(2);
        while (!pq.arr.isEmpty()) {
            System.out.println(pq.peek());
            pq.remove();
        }
    }
}*/

//heap sort
/*import java.util.*;
public class pq {
    static class MinHeap {
        ArrayList<Integer> arr = new ArrayList<>(); //dynamic array
        public void add(int data) {
            //add at last idx
            arr.add(data);
            //up-heapify
            int x = arr.size() - 1; //child idx     
            int par = (x - 1) / 2; //parent idx     
            while (x > 0 && arr.get(x) < arr.get(par)) {
                //swap
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);
                x = par;
                par = (x - 1) / 2;
            }
        }
        public int peek() {
            return arr.get(0);
        }
        public int remove() {
            int data = arr.get(0);      
            //step1: swap first and last
            int temp = arr.get(0);      
            arr.set(0, arr.get(arr.size() - 1));
            arr.set(arr.size() - 1, temp);
            //step2: remove last    
            arr.remove(arr.size() - 1);
            //step3: down-heapify
            downHeapify(0);   
            return data;
        }
        private void downHeapify(int par) {
            int left = 2 * par + 1;        
            int right = 2 * par + 2;        
            int minIdx = par;
            if (left < arr.size() && arr.get(minIdx) > arr.get(left)) {
                minIdx = left;
            }
            if (right < arr.size() && arr.get(minIdx) > arr.get(right)) {
                minIdx = right;
            }   
            if (minIdx != par) {
                //swap
                int temp = arr.get(minIdx);
                arr.set(minIdx, arr.get(par));
                arr.set(par, temp);
                downHeapify(minIdx);
            }       
        }
    }
    public static void heapSort(int arr[]) {
        MinHeap pq = new MinHeap();
        //add all elements to pq        
        for(int i=0; i<arr.length; i++) {
            pq.add(arr[i]);
        }
        //remove elements and put back to arr
        for(int i=0; i<arr.length; i++) {
            arr[i] = pq.remove();
        }
    }
    public static void main(String[] args) {        
        int arr[] = {5,3,8,4,2,1,7,6};
        heapSort(arr);
        System.out.println("Sorted array:");
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}*/

//nearby cars
/*import java.util.*;
public class pq {   
    static class Car implements Comparable<Car> {
        int x;
        int y;
        int dist;

        Car(int x, int y) {
            this.x = x;
            this.y = y;
            this.dist = x*x + y*y; //squared distance
        }

        @Override
        public int compareTo(Car c2) {
            return this.dist - c2.dist; //ascending order
        }
    }
    public static void main(String[] args) {
        int cars[][] = {{3,3}, {5,-1}, {-2,4}};
        int k = 2;

        PriorityQueue<Car> pq = new PriorityQueue<>();

        for(int i=0; i<cars.length; i++) {
            pq.add(new Car(cars[i][0], cars[i][1]));
        }

        System.out.println("Nearest " + k + " cars:");
        for(int i=0; i<k; i++) {
            Car c = pq.remove();
            System.out.println("Car at (" + c.x + ", " + c.y + ")");
        }
    }
}*/

//connect k ropes
/*import java.util.*;
public class pq {   
    public static int connectRopes(int ropes[]) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        //add all ropes to pq
        for(int i=0; i<ropes.length; i++) {
            pq.add(ropes[i]);
        }
        int cost = 0;
        //while more than 1 rope is there
        while(pq.size() > 1) {
            //remove 2 smallest ropes
            int first = pq.remove();
            int second = pq.remove();
            //connect them
            int newRope = first + second;
            cost += newRope;
            //add new rope to pq
            pq.add(newRope);
        }
        return cost;
    }
    public static void main(String[] args) {
        int ropes[] = {4,3,2,6};
        System.out.println("Minimum cost to connect ropes: " + connectRopes(ropes));
    }
}*/

//weakest soldiers
/*import java.util.*;
public class pq {   
    static class Row implements Comparable<Row> {
        int soldiers;
        int idx;    
        Row(int soldiers, int idx) {
            this.soldiers = soldiers;
            this.idx = idx;
        }
        @Override
        public int compareTo(Row r2) {
            if(this.soldiers == r2.soldiers) {
                return this.idx - r2.idx;
            }
            return this.soldiers - r2.soldiers;
        }
    }
    public static int[] kWeakestRows(int mat[][], int k) {      
        PriorityQueue<Row> pq = new PriorityQueue<>();
        for(int i=0; i<mat.length; i++) {
            int soldiers = 0;
            for(int j=0; j<mat[0].length; j++) {
                soldiers += mat[i][j];
            }
            pq.add(new Row(soldiers, i));
        }
        int result[] = new int[k];
        for(int i=0; i<k; i++) {
            result[i] = pq.remove().idx;
        }
        return result;
    }
    public static void main(String[] args) {
        int mat[][] = {{1,1,0,0,0},
                       {1,1,1,1,0},
                       {1,0,0,0,0},
                       {1,1,0,0,0},
                       {1,1,1,1,1}};
        int k = 3;
        int weakestRows[] = kWeakestRows(mat, k);
        System.out.println("The " + k + " weakest rows are:");
        for(int i=0; i<weakestRows.length; i++) {
            System.out.print(weakestRows[i] + " ");     
        }
    }
}*/

//sliding window maximum
/*import java.util.*;
public class pq {   
    public static int[] slidingWindowMax(int arr[], int k) {
        int n = arr.length;
        int result[] = new int[n - k + 1];
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder()); //max-heap      
        for(int i=0; i<k; i++) {
            pq.add(arr[i]);
        }
        result[0] = pq.peek();
        for(int i=k; i<n; i++) {
            //remove the element going out of the window
            pq.remove(arr[i - k]);
            //add the new element
            pq.add(arr[i]);
            //current max
            result[i - k + 1] = pq.peek();
        }
        return result;
    }
    public static void main(String[] args) {
        int arr[] = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        int maxInWindows[] = slidingWindowMax(arr, k);
        System.out.println("Sliding window maximums are:");
        for(int i=0; i<maxInWindows.length; i++) {
            System.out.print(maxInWindows[i] + " ");
        }
    }
}*/