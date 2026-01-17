/*public class Bit {
    public static void main(String args[]) {
        System.out.println(~5);
    } 
}*/

/*public class Bit {
    public static void main(String args[]) {
        System.out.println(5 << 6);
    } 
}
    a<<b = a*2^b*/

/*public class Bit {
    public static void main(String args[]) {
        System.out.println(5 >> 2);
    } 
}
    // a>>b = a/2^b*/

/*public class Bit {
    public static void oddOrEven(int n) {
        if ((n & 1) == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
    public static void main(String args[]) {
        oddOrEven(3);
        oddOrEven(4);
    } 
}*/

/*Get ith bit of a number
public class Bit {
    public static int getIthBit(int n, int i) {
        int bitMask = 1 << i;
        if ((n & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }
    public static void main(String args[]) {
        System.out.println(getIthBit(10, 2));
}
}*/

/*Set ith bit of a number
public class Bit {
    public static int setIthBit(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;
    }
    public static void main(String args[]) {
        System.out.println(setIthBit(10, 2));
}
}*/

/*Clear ith bit of a number
public class Bit {
    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }
    public static void main(String args[]) {
        System.out.println(clearIthBit(10, 1));
}
}*/

public class Bit {
    public static int updateIthBit(int n, int i, int newBit) {
        // Clear ith bit
        n = clearIthBit(n, i);
        // Set ith bit to newBit
        int bitMask = newBit << i;
        return n | bitMask;
    }

    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

    public static void main(String args[]) {
        System.out.println(updateIthBit(10, 2, 1)); // Example usage
    }
}


