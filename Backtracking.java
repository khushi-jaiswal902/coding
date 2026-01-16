/*public class Backtracking {
    public static void changeArr(int arr[], int i, int val) {
        //base case
        if(i == arr.length) {
            printArr(arr);
            return;
        }

        //recursion
        arr[i] = val;
        changeArr(arr, i + 1, val + 1);
        arr[i] = arr[i] - 2; //backtracking step
    }

    public static void printArr(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = new int[5];
        changeArr(arr, 0, 1);
        printArr(arr);
    }
}*/

/*Find all subsets of a set
 public class Backtracking {
    public static void findSubsets(String str, int i, String curr) {
         //base case
            if(i == str.length()) {
            if(curr.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(curr);
        }
                return;
        }
        //include
        findSubsets(str, i + 1, curr + str.charAt(i));
        //exclude
        findSubsets(str, i + 1, curr);
        }  
    public static void main(String args[]) {
            String str = "abc";
        findSubsets(str, 0, "");
    }
    }*/

/*Find all permutations of a string
public class Backtracking {
    public static void findPermutations(String str, String perm, boolean map[]) {
        //base case
        if(str.length() == perm.length()) {
            System.out.println(perm);
            return;
        }
        for(int i=0; i<str.length(); i++) {
            if(map[i] == false) {
                map[i] = true;
                findPermutations(str, perm + str.charAt(i), map);
                map[i] = false; //backtracking step
            }
        }
    }
    public static void main(String args[]) {
        String str = "abc";
        boolean map[] = new boolean[str.length()];
        findPermutations(str, "", map);
    }
}*/

/*public class Backtracking {
    public static void nQueens(char board[][], int row) {
        //base case
        if(row == board.length) {
            printBoard(board);
            return;
        }
        for(int j=0; j<board.length; j++) {
            board[row][j] = 'Q';
            nQueens(board, row + 1);
            board[row][j] = 'x'; //backtracking step 
        }
    }

    public static void printBoard(char board[][]) {
        System.out.println("-----Chess Board-----");
        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int n=2;
        char board[][] = new char[n][n];
        //initialize
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                board[i][j] = 'x';
    }
}
        nQueens(board, 0);
    }
}*/

/*N-Queens Problem (with isSafe function)
//T.c = O(N!)
public class Backtracking {
    public static boolean isSafe(char board[][], int row, int col) {
        //vertical up
        for(int i=row-1; i>=0; i--) {
            if(board[i][col] == 'Q') {
                return false;
            }
        }
        //diagonal left
        for(int i=row-1, j=col-1; i>=0 && j>=0; i--, j--) {
            if(board[i][j] == 'Q') {
                return false;
            }
        }
        //diagonal right
        for(int i=row-1, j=col+1; i>=0 && j<board.length; i--, j++) {
            if(board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public static void nQueens(char board[][], int row) {
        //base case
        if(row == board.length) {
            printBoard(board);
            return;
        }
        
        //column loop
        for(int j=0; j<board.length; j++) {
            if(isSafe(board, row, j)) {
                board[row][j] = 'Q';
                nQueens(board, row + 1);
                board[row][j] = 'x'; //backtracking step 
            }
        }
    }

    public static void printBoard(char board[][]) {
        System.out.println("-----Chess Board-----");
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
        //initialize
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                board[i][j] = 'x';
    }
}
        nQueens(board, 0);
    }
}*/

/* N-Queens Problem (counting total ways to solve N-Queens)
//T.c = O(N!)
public class Backtracking {
    public static boolean isSafe(char board[][], int row, int col) {
        //vertical up
        for(int i=row-1; i>=0; i--) {
            if(board[i][col] == 'Q') {
                return false;
            }
        }
        //diagonal left
        for(int i=row-1, j=col-1; i>=0 && j>=0; i--, j--) {
            if(board[i][j] == 'Q') {
                return false;
            }
        }
        //diagonal right
        for(int i=row-1, j=col+1; i>=0 && j<board.length; i--, j++) {
            if(board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public static void nQueens(char board[][], int row) {
        //base case
        if(row == board.length) {
           //printBoard(board);
              count++;
            return;
        }
        
        //column loop
        for(int j=0; j<board.length; j++) {
            if(isSafe(board, row, j)) {
                board[row][j] = 'Q';
                nQueens(board, row + 1);
                board[row][j] = 'x'; //backtracking step 
            }
        }
    }

    public static void printBoard(char board[][]) {
        System.out.println("-----Chess Board-----");
        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int count = 0;

    public static void main(String args[]) {
        int n=4;
        char board[][] = new char[n][n];
        //initialize
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                board[i][j] = 'x';
    }
}
        nQueens(board, 0);
        System.out.println("Total ways to solve N-Queens = " + count);
    }
}*/

/* N-Queens Problem (finding only one solution to N-Queens)
//T.c = O(N!)
public class Backtracking {
    public static boolean isSafe(char board[][], int row, int col) {
        //vertical up
        for(int i=row-1; i>=0; i--) {
            if(board[i][col] == 'Q') {
                return false;
            }
        }
        //diagonal left
        for(int i=row-1, j=col-1; i>=0 && j>=0; i--, j--) {
            if(board[i][j] == 'Q') {
                return false;
            }
        }
        //diagonal right
        for(int i=row-1, j=col+1; i>=0 && j<board.length; i--, j++) {
            if(board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public static boolean  nQueens(char board[][], int row) {
        //base case
        if(row == board.length) {
           //printBoard(board);
              count++;
            return true;
        }
        
        //column loop
        for(int j=0; j<board.length; j++) {
            if(isSafe(board, row, j)) {
                board[row][j] = 'Q';
                if(nQueens(board, row + 1)) {
                    return true;
                }
                board[row][j] = 'x'; //backtracking step 
            }
        }
        return false;
    }

    public static void printBoard(char board[][]) {
        System.out.println("-----Chess Board-----");
        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int count = 0;

    public static void main(String args[]) {
        int n=4;
        char board[][] = new char[n][n];
        //initialize
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                board[i][j] = 'x';
    }
}
       if(nQueens(board, 0)) {
        System.out.println("Solution exists");
        printBoard(board);
       } else {
        System.out.println("Solution does not exist");
       
        System.out.println("Total ways to solve N-Queens = " + count);
    }
}
}*/

/*Grid ways code
public class Backtracking {
    public static int gridWays(int i, int j, int n, int m) {
        //base case
        if(i == n-1 && j == m-1) {
            return 1;
        } else if(i == n || j == m) {
            return 0;
        }

        //recursion
        int w1 = gridWays(i + 1, j, n, m); //down
        int w2 = gridWays(i, j + 1, n, m); //right

        return w1 + w2;
    }
    public static void main(String args[]) {
        int n=3, m=3;
        System.out.println("Total ways to reach destination = " + gridWays(0, 0, n, m));
    }
}*/

//sudoku solver
public class Backtracking {
    public static boolean isSafe(int board[][], int row, int col, int num) {
        //check row
        for(int j=0; j<board.length; j++) {
            if(board[row][j] == num) {
                return false;
            }
        }
        //check column
        for(int i=0; i<board.length; i++) {
            if(board[i][col] == num) {
                return false;
            }
        }
        //check 3x3 box
        int boxRow = row - row % 3;
        int boxCol = col - col % 3;
        for(int i=boxRow; i<boxRow + 3; i++) {
            for(int j=boxCol; j<boxCol + 3; j++) {
                if(board[i][j] == num) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean solveSudoku(int board[][]) {
        //base case
        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board.length; j++) {
                if(board[i][j] == 0) { //find empty cell
                    //try all numbers from 1 to 9
                    for(int num=1; num<=9; num++) {
                        if(isSafe(board, i, j, num)) {
                            board[i][j] = num; //place the number
                            if(solveSudoku(board)) { //recur
                                return true;
                            }
                            board[i][j] = 0; //backtrack
                        }
                    }
                    return false; //if no number can be placed
                }
            }
        }
        return true; //if solved
    }

    public static void printBoard(int board[][]) {
        System.out.println("-----Sudoku Board-----");
        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int board[][] = {
            {5, 3, 0, 0, 7, 0, 0, 0, 0},
            {6, 0, 0, 1, 9, 5, 0, 0, 0},
            {0, 9, 8, 0, 0, 0, 0, 6, 0},
            {8, 0, 0, 0, 6, 0, 0, 0, 3},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 0, 0, 2, 0, 0, 0, 6},
            {0, 6, 0, 0, 0, 0, 2, 8, 0},
            {0, 0, 0, 4, 1, 9, 0, 0, 5},
            {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };
        if(solveSudoku(board)) {
            printBoard(board);
        } else {
            System.out.println("Solution does not exist");
        }
    }
}