//remove cycle
//merge two sorted list

/*import java.util.*;
public class stack {
    static class Stack {
        static ArrayList<Integer> list = new ArrayList<>();
        
        public static boolean isEmpty() {
            return list.size() == 0;
        }
        public static void push(int data) {
            list.add(data);
        }
        public static int pop() {
            int top = list.get(list.size() -1);
            list.remove(list.size()-1);
            return top;
        }
        public static int peek() {
            return list.get(list.size()-1);
        }
    }
        public static void main(String[] args) {
            Stack.push(1);
            Stack.push(2);
            Stack.push(3);

            while(!Stack.isEmpty()) {
                System.out.println(Stack.peek());
                Stack.pop();
            }
        }
    }*/

/*import java.util.*;
public class stack {
    public static void pushAtBottom(Stack<Integer> s, int data) {
        
        if(s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        pushAtBottom(s,4);
        while(!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}*/

/*import java.util.*;
public class stack {
    public static String reverseString(String str) {
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while(idx < str.length()) {
        s.push(str.charAt(idx));
        idx++;
        }
        StringBuilder result = new StringBuilder("");
        while(!s.isEmpty()) {
            char curr = s.pop();
            result.append(curr);
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String str = "abc";
        String result = reverseString(str);
        System.err.println(result);
    }
}*/

import java.util.*;
public class stack {
    public static void reverseStack(stack<Integer> s) {
        if(s.isEmpty()) {
            return;
        }
        int top = s.pop();
        reverseStack(s);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        reverseStack(s);
        printStack();
    }
}