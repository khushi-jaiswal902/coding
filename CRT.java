/*insertion in matrix
import java.util.*;
public class CRT {
    public static void main(String args[]) {
    int matrix[][] = new int[3][3];
    int n= matrix.length;
    int m = matrix[0].length;

    Scanner sc = new Scanner(System.in);
    for(int i=0; i<n; i++) {
    for(int j=0; j<m; j++) {
    matrix[i][j] = sc.nextInt();
    }
}

    for(int i=0; i<n; i++) {
    for(int j=0; j<m; j++) {
        System.out.print(matrix[i][j] + " ");
    }
        System.out.println();   
    }
}
}*/

/*
 * total elements = sizeOf(arr)/sizeof(arr[0][0])
 * no of rows = sizeOf(arr)/sizeof(arr[0])
 * no of columns = sizeOf(arr[0])/sizeof(arr[0][0])
 */


/*import java.util.*;
public class CRT {
    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int n= matrix.length;
        int m = matrix[0].length;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements of the matrix:");
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        
            System.out.println("Enter element of second matrix");
            int matrix2[][] = new int[3][3];

            for(int i=0; i<n; i++) {
                for(int j=0; j<m; j++) {
                    matrix2[i][j] = sc.nextInt();
                }
            }
             
            int result[][] = new int[3][3];
            for(int i=0; i<n; i++) {
                for(int j=0; j<m; j++) {
                    result[i][j] = matrix[i][j] - matrix2[i][j];
                }
            }
            System.out.println("Resultant matrix after Subtraction:");
            for(int i=0; i<n; i++) {
                for(int j=0; j<m; j++) {
                    System.out.print(result[i][j] + " ");
    }
}
    }
}*/

/*multiplication of two matrices
import java.util.*;
public class CRT {
    public static void main(String[] args) {
        int matrix1[][] = new int[2][2];
        int n= matrix1.length;
        int m= matrix1[0].length;
        
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }

        int matrix2[][] = new int[2][2];
        int u= matrix2.length;
        int v= matrix2[0].length;
       
        for(int i=0; i<u; i++) {
            for(int j=0; j<v; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }
        
        int result[][] = new int[2][2];
        for (int i = 0; i <n; i++) {
            for(int j=0; j<m; j++) {
        for(int k=0; k<m; k++) {
            
                result[i][j] += matrix1[i][k]*matrix2[k][j];
        }
        }
        }
         System.out.println("Resultant matrix after multiplication:");
            for(int i=0; i<n; i++) {
                for(int j=0; j<m; j++) {
                    System.out.print(result[i][j] + " ");
    }
}
   
    }
}*/

/*import java.util.*;

public class CRT {
    public static boolean search(int matrix[][], int target) {
        int n= matrix.length;
        int m= matrix[0].length;
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(matrix[i][j] == target) {
                    System.out.println("Found at cell (" + i + ", " + j + ")");
                    return true;
                }
            }
        }
            System.out.println("result not found");
                return false;
                }
            public static void main(String args[]) {
                int matrix[][] = new int[3][3];
                int n= matrix.length;
                int m= matrix[0].length;
                int target = 5;
                Scanner sc = new Scanner(System.in);
                for(int i=0; i<n; i++) {
                    for(int j=0; j<m; j++) {
                        matrix[i][j] = sc.nextInt();
                    }
                }
                System.out.println("Matrix:");
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
                search(matrix, target);
            }
    }*/








