/*import java.util.*;

public class arrey {
    public static void main(String args[]) {
        char arr[] = {'a', 'b', 'c', 'd'};
        String str = "abcd";
        String str2 = new String("xyz");

        Scanner sc = new Scanner(System.in);
        String name;
        name = sc.nextLine();
        System.out.println(name);
    }
}*/

/*length of string
public class arrey {
    public static void main(String args[]) {
        String fullName = "Tony Stark" ;
        System.out.println(fullName.length());
        
    }
} */

/*String concatenation
public class arrey {
    public static void main(String args[]) {
        String firstName = "Shradha";
        String lastName = "khapra";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);
    }
}*/

/*charAt
public class arrey {
    public static void main(String args[]) {
String firstName = "Shradha";
String lastName = "khapra";
String fullName = firstName + " " + lastName;
System.out.println(fullName.charAt(1));
}
}*/

/*  print all letters
public class arrey {
    public static void printLetters(String str) {
        for(int i=0; i<str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }
    public static void main(String args[]) {
        String firstName = "Shradha";
        String lastName = "khapra";
        String fullName = firstName + " " + lastName;

        printLetters(fullName);
    }
}*/

/*check if a string is palindrome or not
T.C = O(n)
public class arrey {
    public static boolean isPalindrome(String str) {
        for(int i=0; i<str.length()/2; i++) {
            int n= str.length();
            if(str.charAt(i) != str.charAt(n-i-1)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]) {
        String str = "racecar";
        System.out.println(isPalindrome(str));
        
    }
}*/

/*compare two string
public class arrey {
    public static void main(String args[]) {
        String s1 = "Tony";
        String s2 = "Tara";
        String s3 = new String("Tara");

        if(s1.equals(s3)) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
    }
}*/


/*substring
public class arrey {
    public static String substring(String str, int si, int ei) {
        String substr = "";
        for(int i=si; i<ei; i++) {
            substr += str.charAt(i);
        }
        return substr;
    }
    public static void main(String args[]) {
        //Substring
        String str = "HelloWorld";
        System.out.println(substring(str,0,5));   
    }
}*/

/*substring direct method
public class arrey {
    public static void main(String args[]) {
        //Substring
        String str = "HelloWorld";
        System.err.println(str.substring(0,5));
    }
}*/

/*question:- print largest string
//T.C = O(x*n)
public class arrey {
    public static void main(String args[]) {
        String fruits[] = {"apple", "mango", "banana"};

        String largest = fruits[0];
        for(int i=1; i<fruits.length; i++) {
            if(largest.compareTo(fruits[i]) < 0) {
                largest = fruits[i];
            }
        }
    
        System.out.println(largest);
        
    }
}*/

/*stringBuilder
//T.C = O(26)
public class arrey {
public static void main(String args[]) {
    StringBuilder sb = new StringBuilder("");
    for(char ch = 'a'; ch<='z'; ch++) {
        sb.append(ch);
    }
    System.err.println(sb);
    System.err.println(sb.length());
}
}*/

/*question 4
public class arrey {
    public static void main(String args[]) {
        String str = "hi i am khushi";
         String str1 = str.toUpperCase();
        System.err.println(str1);
    }
}*/

/* another way to convert to uppercase
public class arrey {
    //t.c = O(n)
    public static String toUpperCase(String str) {
        StringBuilder sb = new  StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=1; i<str.length(); i++) {
            if(str.charAt(i) == ' ' && i<str.length()-1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));   
    }
}
return sb.toString();
    }
public static void main(String args[]) {
    String str = "hi, i am shradha";
    System.out.println(toUpperCase(str));
}
}*/

/* String compression
//T.C = O(n)
public class arrey {
    public static String compress(String str) {
        String newStr = "";
        for(int i=0; i<str.length(); i++) {
            Integer count = 1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
                count++;
                i++;
    }
    newStr += str.charAt(i);
        if(count > 1) {
            newStr += count.toString();
        }
    }
    return newStr;
}
public static void main(String args[]) {
    String str = "aaabbccccddeee";
    System.out.println(compress(str));
}
}*/

//solve string compression using string builder
//T.C = O(n)
/*public class arrey {
    public static String compress(String str) {
        StringBuilder newStr = new StringBuilder("");
        for(int i=0; i<str.length(); i++) {
            Integer count = 1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
                count++;
                i++;
    }
    newStr.append(str.charAt(i));
        if(count > 1) {
            newStr.append(count.toString());
        }
    }
    return newStr.toString();
}
public static void main(String args[]) {
    String str = "aaabbccccddeee";
    System.out.println(compress(str));
}
}*/