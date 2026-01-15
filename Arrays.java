
//import java.awt.SystemColor;

/*import java.util.*;
public class Arrays {
    public static void main(String args[]) {
        int marks[] = new int[100];

        System.out.println("length of array = " + marks.length);

        Scanner sc = new Scanner(System.in);

        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

         //marks[2] = marks[2] +1;
        System.out.println("phy :" + marks[0]);
        System.out.println("chem :" + marks[1]);
        System.out.println("math :" + marks[2]); 
        
        int percentage = (marks[0] + marks[1] + marks[2])/3;
        System.out.println(percentage);
    }
}*/

/*marks updation by call by reference
public class Arrays {
    public static void update(int marks[]) {
        for(int i=0; i<marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }
    public static void main(String args[]) {
        int marks[] = {97,98,99};
        update(marks);
    
    for(int i=0; i<marks.length; i++) {
        System.out.println(marks[i]+" ");
    }
        System.out.println();
    }
}*/

/*Linear Search
public class Arrays {
    public static int LinearSearch(int numbers[], int value) {
        
        for(int i=0; i<numbers.length; i++) {
            if(numbers[i] == value) {
                return i;
        }
        }
            return -1;
    }

    public static void main(String args[]) {
        int numbers[] = {2,4,6,8,8};
        int value =4;

        int index = LinearSearch(numbers, value);
        if(index == -1) {
            System.out.println("not found");
        } else {
            System.out.println("value is at index " + index);
        }  
    }
}*/

/*Largest number
public class Arrays {
    public static int largestNumber(int numbers[]) {
        int largest = numbers[0];
        int smallest = numbers[0];
        for(int i=0; i<numbers.length; i++) {
            if(numbers[i]>largest) {
                largest = numbers[i];
        } 
       
    }
        return largest;     
}
        public static void main(String args[]) {
            int nums[] = {2,3,4,5,6};
            int largest = largestNumber(nums);
        System.out.println("The largest number is " + largest);
        }
}*/

/*Binary Search
public class Arrays {
    public static int binarySearch(int numbers[], int value) {
        int st=0;
        int end = numbers.length - 1;
        int mid = st+(end-st)/2;

           while(st<=end) {           
            if(numbers[mid]== value) {
                return mid;
            } else if(numbers[mid]>value) {
                end = mid-1;
            } else {
                st = mid+1;
            }
        }
        return -1;
    }
    public static void main(String args[]) {
        int numbers[] = {2,4,6,8,7};
        int value =6;
        System.out.println("the index of value is" + binarySearch(numbers, value));
    }
}*/

/*reverse array
public class Arrays {
    public static void reverse(int numbers[]) {
        int first =0, last = numbers.length-1;

        while(first<last) {
            //swap
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first++;
            last--;
        }
    }

    public static void main(String args[]) {
        int numbers[] = {2,4,6,7,8};
        reverse(numbers);
        for(int i=0; i<numbers.length; i++) {
        System.out.println(numbers[i] +"");
        }
        System.out.println();
    }
}*/

/*find all possible pairs
public class Arrays {
    public static void printPairs(int numbers[]) {
        for(int i=0; i<numbers.length; i++) {
        int curr = numbers[i];
        for(int j=i+1; j<numbers.length; j++) {
            System.out.println("(" + curr + " , " + numbers[j] + " ) ");
        }
        System.out.println();
        }
    }

    //formula for calculate toatal pairs = n(n-1)/2;
    //T.C = O(n^2)

    public static void main(String args[]) {
        int numbers[] = {2,4,6,8,10};
        printPairs(numbers);
    }
}*/

/*print all subarray
public class Arrays {
    public static void printSubarrays(int numbers[]) {
        int ts =0;
        for(int i=0; i<numbers.length; i++) {
            int start = i;
            for(int j=i; j<numbers.length; j++) {
                int end = j;
                for(int k=start; k<=end; k++) { //print
                    System.out.println(numbers[k]+" ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        //Formula for calculating total subarryays = n(n+1)/2
        System.out.println("total subarrays =" + ts);
    }

    public static void main(String args[]) {
        int numbers[] = {2,4,6,8,10};
        printSubarrays(numbers);
    }
}*/

/*Maximum subarray sum
import java.util.*;
public class Arrays{
    public static void maximumSubarraySum(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<numbers.length; i++) {
            int start = i;
            for(int j=i; j<numbers.length; j++) {
                int end = j;
                 currSum = 0;
                for(int k=start; k<=end; k++) {
                    //subarray sum
                    currSum += numbers[k];
                }
                System.out.println(currSum);
            if(maxSum < currSum) {
                maxSum = currSum;
            }
        }
    }
    System.out.println("max sum = " + maxSum);
    }
    
public static void main(String args[]) {
    int numbers[] = {2,4,6,8,10};
    maximumSubarraySum(numbers);
}
}*/

/*tRAPPING WAter
public class Arrays {
    public static int trappedRainWater(int height[]) {
        int n=height.length;
        //calculate left max boundary - array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i=1; i<n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }

        //calculate right max boundary - array
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }

        int trappedWater = 0;
        //loop
        for(int i=0; i<n; i++) {
            //waterLevel = min(leftmax bound, rightmax bound)
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            //trapped water = waterLevel - height[i]
            trappedWater += waterLevel - height[i];
        }
        return trappedWater;
    }
    public static void main(String args[]) {
        int height[] = {4,2,0,6,3,2,5};
        System.out.println(trappedRainWater(height));
    }
}*/

/*public class Arrays {
    public static boolean isSafe(char board[][], int row, int col) {
        for(int i=row-1; i>=0; i--) {
            if(board[i][col] == 'q') {
                return false;
            }
        }
        for(int i=row-1, j=col-1; i>=0 && j>=0; i--, j--) {
            if(board[i][j] == 'q') {
                return false;
            }
        }
        for(int i=row-1, j=col+1; i>=0 && j<board.length; i--, j++) {
      
            if(board[i][j] == 'q') {
                return false;
            }
        }
        return true;
    }
    public static void nQueens(char board[][], int row) {
        if(row == board.length) {
            printBoard(board);
            return;
        }
        for(int j=0; j<board.length; j++) {
            if(isSafe(board, row, j)) {
                board[row][j] = 'q';
                nQueens(board, row+1);
                board[row][j] = '-';
            }
        }
    }
    public static void printBoard(char board[][]) {
        System.out.println("-----chess board-----");
        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        int n=4;
        char board[][] = new char[n][n];
        //initialize chess board
        for(int i=0; i<n; i++) {    
            for(int j=0; j<n; j++) {
                board[i][j] = '-';
            }
        }
        nQueens(board, 0);
    }
}*/

public class Arrays {
    
}