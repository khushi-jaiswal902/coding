
/*import java.util.*;
public class Hashi {
    public static void main(String args[]) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 120);
        map.put("USA", 30);
        map.put("China", 150);
        System.out.println(map);

        /*get key O(1) 
        int population = map.get("India");
        System.out.println(population);
        System.out.println(map.get("Indonesia"));*/

        /*contains key -O(1)
        System.out.println(map.containsKey("India"));
        System.out.println(map.containsKey("Indonesia"));*/

        /*remove key -O(1)
        System.out.println(map.remove("China"));
        System.out.println(map);*/

        /*size of map
        System.out.println(map.size());*/

        /* Is Empty
        System.out.println(map.isEmpty());*/

        /*clear function
        map.clear();
        System.out.println(map);
    }
}*/

/*iterate over hashmap
import java.util.*;
public class Hashi {
    public static void main(String args[]) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 120);
        map.put("USA", 30);
        map.put("China", 150);
        map.put("Indonesia", 130); 
        map.put("Russia", 40);
        //iterate
        Set<String> keys = map.keySet();
        System.out.println(keys);
        for(String key : keys){
            System.out.println("Key: "+key+" Value: "+map.get(key));
        }
    }
}*/

//hashing
//hash function
//hash code
//hashmap is unordered collection of key-value pairs

//hashmap implementation

/*Linked Hashmap
import java.util.*;
public class Hashi {
    public static void main(String args[]) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        map.put("India", 120);
        map.put("USA", 30);
        map.put("China", 150);
        map.put("Indonesia", 130); 
        map.put("Russia", 40);
        System.out.println(map);
    }
}*/

//linked hashmap maintains insertion order - sorted order

/*Tree hashmap
//tree map is implemented using red black tree
//red black tree is a self balancing binary search tree
//in tree map keys are sorted in alphabatical order
import java.util.*;
public class Hashi {
    public static void main(String args[]) {
        TreeMap<String, Integer> tm = new TreeMap<>();
        tm.put("India", 120);
        tm.put("USA", 30);
        tm.put("China", 150);
        tm.put("Indonesia", 130); 
        tm.put("Russia", 40);
        System.out.println(tm);
    }
}*/

/*majority element in an array - brute force
import java.util.*;
public class Hashi {
    public static void main(String args[]) {
        int arr[] = {2,2,1,1,1,2,2};
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }else{
                map.put(arr[i], 1);
            }
        }
        Set<Integer> keys = map.keySet();
        for(Integer key : keys){
            if(map.get(key) > arr.length/3){
                System.out.println("Majority Element: "+key);
            }
        }
    }
}*/

/*majority element in an array - optimal
import java.util.*;
public class Hashi {
    public static void main(String args[]) {
        int arr[] = {2,2,1,1,1,2,2};
        java.util.HashMap<Integer, Integer> map = new java.util.HashMap<>();
        for(int i=0; i<arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }
        Set<Integer> keys = map.keySet();
        for(Integer key : keys){
            if(map.get(key) > arr.length/3){
                System.out.println("Majority Element: "+key);
            }
        }
    }
}*/

/*valid anagram
import java.util.*;
public class Hashi {
    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        for(int i=0; i<t.length(); i++){
            char ch = t.charAt(i);
            if(map.get(ch) != null){
                if(map.get(ch) == 1) {
                    map.remove(ch);
                } else {
                    map.put(ch, map.get(ch)-1);
                }
            }else{
                return false;
            }
        }
        return map.isEmpty();
    }
    public static void main(String args[]) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s, t));
    }
}*/

/*hashset
import java.util.*;
public class Hashi {
    public static void main(String args[]) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(2); //duplicate elements are not allowed
        System.out.println(set);

        /*if(set.contains(2)){
            System.out.println("Set contains 2");
    } if(set.contains(5)){
            System.out.println("Set contains 5");
        }else{
            System.out.println("Set does not contain 5");
        }*/

        /*set.remove(2);
        System.out.println(set);

        System.out.println("Size of set: "+set.size());
        //System.out.println(set.isEmpty());
    }
}*/

/*iterate over hashset
import java.util.*;
public class Hashi {
    public static void main(String args[]) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);

        /*iterate using iterator
        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }*/

     /*iterate using for each loop
     for(integer i : set) {
     System.out.println(i);
     } 

    }
}*/

/*linked hashset - it maintains insertion order
import java.util.*;
public class Hashi {
    public static void main(String args[]) {
        HashSet<String> cities = new HashSet<>();
        cities.add("delhi");
        cities.add("mumbai");
        cities.add("bangalore");
        cities.add("chennai");
        System.out.println(cities);

        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("delhi");
        lhs.add("mumbai");
        lhs.add("bangalore");
        lhs.add("chennai");
        System.out.println(lhs);

        lhs.remove("mumbai");
        System.out.println(lhs);
    }
}*/

/*tree hashset - it stores elements in sorted order in ascending order
//tree set is implemented using treeMap -> red black tree
import java.util.*;
public class Hashi {
    public static void main(String args[]) {
        TreeSet<String> ts = new TreeSet<>();
        ts.add("delhi");
        ts.add("mumbai");
        ts.add("bangalore");
        ts.add("chennai");
        System.out.println(ts);

        TreeSet<Integer> ts2 = new TreeSet<>();
        ts2.add(45);
        ts2.add(10);
        ts2.add(15);
        System.out.println(ts2);
    }
}*/

/*count distinct elements in an array
import java.util.*;
public class Hashi {
    public static void main(String args[]) {
        int arr[] = {1,2,3,1,2,4,5,6,7,5};
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<arr.length; i++){
            set.add(arr[i]);
        }
        System.out.println("Distinct elements count: "+set.size());
    }
}*/

/*union and intersection of two arrays
import java.util.*;
public class Hashi {
    public static void main(String args[]) {
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {4,5,6,7,8};
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<arr1.length; i++){
            set.add(arr1[i]);
        }
        for(int i=0; i<arr2.length; i++){
            set.add(arr2[i]);
        }
        System.out.println("Union: "+set.size());
        //intersection
        int count = 0;
        for(int i=0; i<arr2.length; i++){
            if(set.contains(arr2[i])){
                count++;
            }
        }
        System.out.println("Intersection: "+count);
    }
}*/

/*find itinary from tickets
import java.util.*;
public class Hashi {
    public static void main(String args[]) {
        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("Chennai", "Banglore");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");
        //find starting point
        HashSet<String> dest = new HashSet<>();
        for(String i : tickets.values()){
            dest.add(i);
        }
        String start = "";
        for(String i : tickets.keySet()){
            if(!dest.contains(i)){
                start = i;
                break;
            }
        }
        //traveling
        String ans = "";
        while(tickets.containsKey(start)){
            String destination = tickets.get(start);
            ans += start + " -> ";
            start = destination;
        }
        ans += start;
        System.out.println("Itinerary: "+ans);
    }
}*/

/*largest subarray with 0 sum
import java.util.*;
public class Hashi {
    public static void main(String args[]) {
        int arr[] = {1, -1, 3, 2, -2, -3, 3};
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int maxLen = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
            if(sum == 0){
                maxLen = i + 1;
            }else{
                if(map.containsKey(sum)){
                    int len = i - map.get(sum);
                    maxLen = Math.max(maxLen, len);
                }else{
                    map.put(sum, i);
                }
            }
        }
        System.out.println("Length of largest subarray with 0 sum: "+maxLen);
    }
}*/

//subarray sum equals k
import java.util.*;
public class Hashi {
    public static void main(String args[]) {
        int arr[] = {1,2,3,-2,5};
        int k = 5;
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int count = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
            if(sum == k){
                count++;
            }
            if(map.containsKey(sum - k)){
                count += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        System.out.println("Count of subarrays with sum equal to k: "+count);
    }
}