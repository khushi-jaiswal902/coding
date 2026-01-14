
/*import java.util.ArrayList;
public class MyArrayList {
    public static void main(String args[]) {
        //ClassName objectName = new className();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.err.println(list);*/

        /* size of array list 
        System.err.println(list.size()); */

        /* get element 
        int element = list.get(2);
        System.out.println(element);*/

        /* Remove element 
        list.remove(2);
        System.out.println(list); */

        /* Set element 
         2nd index pe 10 set krdo
        list.set(2, 10);
        System.out.println(list);*/

        /*Contains element = no is exist or not
        list.contains(1);
        System.out.println(list.contains(1));*/
    /* }
}*/

/*import java.util.ArrayList;
public class MyArrayList {
    public static void main(String args[]) {
        //ClassName objectName = new className();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        //print the array list
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
    }
}*/

/*Find max element in array list
import java.util.ArrayList;
public class MyArrayList {
    public static void main(String args[]) {
        //ClassName objectName = new className();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        list.add(2);
        list.add(5);
        list.add(9);
        list.add(6);
        list.add(8);

        int max = Integer.MIN_VALUE;
        for(int i=0; i<list.size(); i++){
            if(max < list.get(i)){
                max = list.get(i);
            }
        }
        System.out.println("Max value is: "+max);
    }
}*/

/*swap 2 numbers in array list
import java.util.ArrayList;
public class MyArrayList {
    public static void swap(ArrayList<Integer> list, int idx1, int idx2){
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }
    public static void main(String args[]) {
        //ClassName objectName = new className();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(6);
        list.add(8);

        int idx1 = 1, idx2 = 3;
        System.out.println("Before swap: "+list);
        swap(list, idx1, idx2);
        System.out.println("After swap: "+list);
    }
}*/

/*sort an array list
import java.util.ArrayList;
import java.util.Collections;
public class MyArrayList { 
    public static void main(String args[]) {
        //ClassName objectName = new className();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(6);
        list.add(8);
        System.out.println("Before sort: "+list);
        Collections.sort(list);
        System.out.println("After sort: "+list);
    }
}*/

/* 
import java.util.ArrayList;
public class MyArrayList {
    public static void swap (ArrayList<Integer> list, int index1, int index2) {
        int temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);
    }
        public static void main(String args[]) {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(1);
            list.add(2);
            list.add(3);

           int index1 =1;
           int index2 =2;

            swap(list, index1, index2);
            System.err.println(list);

        }
    }*/

/*Container with most water brute force approach
import java.util.ArrayList;
public class MyArrayList {
    public static int storeWater(ArrayList<Integer> list) {
        int maxWater = 0;
        //brute force
        for(int i=0; i<list.size(); i++) {
            for(int j=i+1; j<height.size(); j++) {
                int ht = Math.min(height.get(i), height.get(j));
                int width = j-1;
                int currWater = ht*width;
                maxWater = Math.max(maxWater, currWater);
            }
        }
        return maxWater;
    }

    public static void main(String args[]) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println(storeWater(height));
    }
}*/

/*Container with most water two pointer approach
import java.util.ArrayList;
public class MyArrayList {
    public static int storeWater(ArrayList<Integer> height) {
        int maxWater = 0;
        int lp = 0;
        int rp = height.size()-1;

        while(lp<rp) {
            //calculate water area
            int ht = Math.min(height.get(lp), height.get(rp));
            int width = rp-lp;
            int currWater = ht*width;
            maxWater = Math.max(maxWater, currWater);

            //update ptr
            if(height.get(lp)<height.get(rp)) {
                lp++;
            } else {
                rp--;
            }
        }
        return maxWater;
    }

    public static void main(String args[]) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println(storeWater(height));
        
    }
}*/

/*pair sum brute force approach
//Question:- find if any pair in a sorted ArrayList has a target sum
import java.util.ArrayList;
public class MyArrayList {
    public static boolean pairSum(ArrayList<Integer> list, int target) {
        for(int i=0; i<list.size(); i++) {
            for(int j=i+1; j<list.size(); j++) {
                if(list.get(i) +list.get(j) == target) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
        int target = 5;
        System.out.println(pairSum(list, target));
}
}*/

//Pair sum two pointer approach
import java.util.ArrayList;
import java.util.Collections;
public class MyArrayList {
    public static boolean pairSum(ArrayList<Integer> list, int target) {
        Collections.sort(list);
        int lp = 0;
        int rp = list.size()-1;
    
        while(lp < rp) {
            if(list.get(lp)+list.get(rp) == target) {
                return true;
            }
            if(list.get(lp)+list.get(rp) <target) {
                lp++;
            } else {
                rp--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
        int target = 7;
        System.out.println(pairSum(list, target));
    }
}

