/*Memozitation method
public class Dynamic {
    public static int fib(int n, int dp[]) {
        if(n == 0 || n == 1) {
            return n;
        }
        if(dp[n] != 0) {
            return dp[n];
        }
        dp[n] = fib(n-1, dp) + fib(n-2, dp);
        return dp[n];
    }
    public static void main(String args[]) {
        int n = 6;
        int dp[] = new int[n+1];
        System.out.println(fib(n, dp));
    }
}*/

/*Tabulation method
//T.C = O(n)
public class Dynamic {
    public static int fibTabulation(int n) {
        int dp[] = new int[n + 1];

        // Handle small cases explicitly to avoid ArrayIndexOutOfBounds
        if (n == 0) return 0;
        if (n == 1) return 1;

        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }

    public static void main(String args[]) {
        int n = 6;
        System.out.println(fibTabulation(n));  // Output: 8
    }
}*/

/*Through recursion
//T.C = O(2^n)
public class Dynamic {
    public static int climbingStairs(int n) {
        if(n == 0) {
            return 1;
        }
        if(n<0) {
            return 0;
        }
        return climbingStairs(n-1) + climbingStairs(n-2);
    }

public static void main(String args[]) {
    int n = 4;
    int ways[] = new int[n+1];
    System.out.println(climbingStairs(n));
}
}*/

/* Climbing stairs using memozitation method
//T.C = O(n)
import java.util.Arrays;
public class Dynamic {
    public static int climbingStairs(int n, int dp[]) {
        if(n == 0) {
            return 1;
        }
        if(n<0) {
            return 0;
        }
        if(dp[n] != -1) {
            return dp[n];
        }
        dp[n] = climbingStairs(n-1, dp) + climbingStairs(n-2, dp);
        return dp[n];
    }   

    public static void main(String args[]) {
        int n = 4;
        int dp[] = new int[n+1];
        Arrays.fill(dp, -1);
        System.out.println(climbingStairs(n, dp));
    }
}*/

//Climbing stairs using tabulation method
//T.C = O(n)
public class Dynamic {
    public static int climbingStairs(int n) {
        int dp[] = new int[n+1];
        dp[0] = 1;
        for(int i=1; i<=n; i++) {
            if(i == 1) {
                dp[i] = dp[i-1];
            } else {
                dp[i] = dp[i-1] + dp[i-2];
            }
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n= 5;
        int dp[] = new int[n+1];
        System.out.println(climbingStairs(n));  
    }
}


