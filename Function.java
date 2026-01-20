/*public class Function {
    public static void printHelloworld() {
        System.out.println("Hellow world");
    }
    public static void main(String args[]) {
        printHelloworld();
    }
}*/

/*import java.util.*;
public class Function {
public static void calculateSum() {
    Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println(sum);
}
    public static void main (String args[]) {
        calculateSum();
    }
}*/

/*public class Function {
    public static void main(String args[]) {
        int a=5;
        int b=7;

        int temp = a;
        a=b;
        b=temp;

        System.out.println("a = "+ a);
        System.out.println("b ="+b);
    }
}*/

/*import java.util.*;
public class Function {
    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int product = a*b;
        System.out.println(product);
    }
}*/

/*public class Function {
public static int multiply(int a, int b) {
    int product = a*b;
    return product;
}

public static void main(String args[]) {
    int a =9;
    int b=8;
    int product = multiply(a,b);
    System.out.println("a*b =" + product);
     product = multiply(20,40);
     System.out.println("a*b =" + product);
}
}*/

/*factorial
public class Function {
    public static void main(String[] args) {
        int f =1;
        int n =5;
        for(int i=1; i<=n; i++) {
            f = f*i;
        }
            System.out.println(f);
    }
}*/

/*factorial using function call
public class Function {
    public static int factorial(int n) {
        int f =1;
        for(int i=1; i<=n; i++) {
            f = f*i;
        }
        return f;
    }

    public static void main(String args[]) {
        System.out.println(factorial(4));
    }
}*/


/*Binomial coefficient
public class Function {
     public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }
    public static int binCoeff(int n, int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);

        int binCoeff = fact_n / (fact_r * fact_nmr);
        return binCoeff;
    }

    public static void main(String[] args) {
        System.out.println(binCoeff(5,2));
    }
}*/

/*Function Overloading
public class Function {
    public static int sum(int a , int b) {
        return a+b;
    }
    public static int sum(int a, int b, int c) {
        return a+b+c;
    }
    public static void main(String args[]) {
        System.out.println(sum(3,4));
        System.out.println(sum(4,5,6));
    }
}*/

/*Function overloaing of adding 2 int numbers and 2 float numbers
public class Function {
    public static int sum(int a, int b) {
        return a+b;
    }
    public static float sum(float a, float b) {
        return a+b;
    }
    public static void main(String args[]) {
        System.out.println(sum(3,4));
        System.out.println(sum(3.2f,4.4f));

    }
}*/

/*prime number
public class Function {
    public static boolean isPrime(int n) {
        for(int i=2; i<=n-1; i++) {
            if(n%i == 0) {
                return false;
            }
        }
        return true;
    }
 public static void main(String args[]) {
            System.out.println(isPrime(5));
        }  
}*/



/*  optimized code of prime number
public class Function {
public static boolean isPrime(int n) {
    if(n == 2) {
        return true;
    }

    for(int i=2; i<=Math.sqrt(n); i++) {
        if(n%i == 0) {
            return false;
        }
    }
    return true;
}

public static void main(String args[]) {
    System.out.println(isPrime(8));
}
}*/

/*all prime number in ranges
public class Function {
    public static boolean isPrime(int n) {
    if(n == 2) {
        return true;
    }

    for(int i=2; i<=Math.sqrt(n); i++) {
        if(n%i == 0) {
            return false;
        }
    }
    return true;
}

    public static void primesInRanges(int n) {
        for(int i=2; i<=n; i++) {
            if(isPrime(i)) {
                System.out.println(i+"");
            }
        }
        System.out.println();
    }

    public static void main(String args[]) {
        primesInRanges(12);
    }  
}*/

/* binary to decimal code 
public class Function{
public static void binToDec(int binNum) {
    int myNum = binNum;
    int pow = 0;
    int decNum = 0;

    while(binNum > 0) {
        int lastDigit = binNum % 10;
        decNum = decNum + (lastDigit * (int)Math.pow(2, pow));

        pow++;
        binNum = binNum/10;
    }
    System.out.println("decimal of " +myNum +" = " + decNum);
}

public static void main(String args[]) {
    binToDec(101);
}
}*/

/*bubble sort
public class Function {
    public static void main(String args[]) {
        int numbers[] = {5,7,8,9,1};
        for(int i=0; i<numbers.length-1; i++) {
            for(int j=0; j<numbers.length-1; j++) {
                if(numbers[j] > numbers[j+1]) {
                    int temp = numbers[j];
                    numbers[j]=numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }
        for(int num: numbers) {
        System.out.print(num+"");
    }
    }  
    }*/

