/*public class JavaBasics {
    public static void main(String args[]) {
        System.out.println("****");
        System.out.println("***");
        System.out.println("**");
        System.out.println("*");
    }
}*/

/*public class JavaBasics {
    public static void main(String args[]) {
        int[] nums = {2, 3, 4, 5};  
        int target = 4;             
        
        int result = search(nums, target);
        System.out.println("Result: " + result);
    }

    public static int search(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
               int index = i;
                return index;  
            }
        }
        return -1; 
    }
}*/

/*public class JavaBasics {
    public static void main(String args[]) {

        int temp;
        int num1=20;
        int num2=10;
        System.out.println("number before swapping");
        System.out.println("num1 = " + num1 + ", num2 = " + num2);
        temp = num1;
        num1= num2;
        num2= temp;

        
        System.out.println("number after swapping");
        System.out.println("num1 = " + num1 + ", num2 = " + num2);
    }
}*/
/*import java.util.*;

public class JavaBasics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);  

        System.out.print("Enter a number: ");
        int a = sc.nextInt();                

        if (a % 2 == 0) {
            System.out.println("a is even");
        } else {
            System.out.println("a is odd");
        }

        sc.close();  
    }
}*/

/*public class JavaBasics {
    public static void main(String args[]) {
        int a =9;
        int b= 6;
        int c=10;

        if(a>b && a>c) {
            System.out.println(a);
        }
        else if(b>a && b>c) {
            System.out.println(b);
        }
        else {
            System.out.println(c);
        }

    }}*/

    /*public class JavaBasics {
        public static void main(String args[]) {
            int number = 8;

            String type = ((number%2)==0) ? "even" : "odd";
            System.out.println(type);
        }
    }*/

    /*import java.util.*;
    public class JavaBasics {
        public static void main(String args[]) {
           Scanner sc = new Scanner(System.in);
           int a = sc.nextInt();
           int b = sc.nextInt();
           char operator = sc.next().charAt(0);

            switch(operator) {
                case '+': System.out.print(a+b);
                break;
                case '-': System.out.println(a-b);
                break;
                case '*': System.out.println(a*b);
                break;
                case '/': System.out.println(a/b);
            }


        }
    }*/

 /*import java.util.*;
    public class JavaBasics {
        public static void main(String args[]) {
            Scanner sc = new Scanner (System.in);
            int n= sc.nextInt();
           
           int i =1;
            int sum=0;
           while(i<=n) {
                sum += i;
                i++;
            
            }
            System.out.println(sum);
            
        }
    }*/

    /*public class JavaBasics {
        public static void main(String args[]) {
            for(int i =1; i<=4; i++) {
                System.out.println("****");
            }
        }
    }*/

    /*public class JavaBasics {
        public static void main(String args[]) {
            int i=1;
            while(i<=4) {
                System.out.println("****");
                i++;
            }
        }
    }*/

    /*public class JavaBasics {
        public static void main(String args[]) {
            int n=10899;
            int rev = 0;
            while(n>0) {
            int lastDigit=n%10;
            n=n/10;
            
             rev = (rev*10) + lastDigit;
             System.out.println(rev);
            }
        }
    }*/

/*import java.util.Scanner;
public class JavaBasics {
        public static void main(String args[]) {
            Scanner sc = new Scanner (System.in);
            do { 
                System.out.println("enter your number");
                 int a = sc.nextInt();
                if(a%2 ==0) {
                    break;
                }
                System.out.println(a);
            }while(true);  
        }
    }*/

    /*public class JavaBasics {
        public static void main(String args[]) {
            for(int i=0; i<=5; i++) {
                if(i ==3) {
                    continue;
                }
                System.out.println(i);
            }
        }
    }*/

/*import java.util.Scanner;
public class JavaBasics {
        public static void main(String args[]) {
            Scanner sc = new Scanner (System.in);
            do { 
                System.out.println("enter your number");
                    int a = sc.nextInt();
                    if(a == 0) {
                    break;
                 }
                if(a%10 ==0) {
                    continue;
                }
                System.out.println(a);
            }while(true);
            sc.close();
        }
    }*/

/*import java.util.*;
public class JavaBasics {
    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
        int n= sc.nextInt();
       
         boolean  isPrime = true;
        for(int i=2; i<n-1; i++) {
            if(n%i == 0) {
                isPrime = false;
            }
        }

        if(isPrime == true) {
            System.out.println("n is prime"); 
        } else {
            System.out.println("n is not prime");
        }
    }
}*/







