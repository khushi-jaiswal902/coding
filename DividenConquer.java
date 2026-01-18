/* Divide and Conquer
 * Merge Sort
 
public class DividenConquer {
    public static void printArr(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void mergeSort(int arr[], int si, int ei) {
        while(si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid + 1, ei);
        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si; //iterator for left part
        int j = mid + 1; //iterator for right part
        int k = 0; //iterator for temp part

        while(i <= mid && j <= ei) {
            if(arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        //left part
        while(i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }

        //right part
        while(j <= ei) {
            temp[k] = arr[j];
            j++;
            k++;
        }

        //copy temp to original
        for(k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }

        
    }
    public static void main(String args[]) {
        int arr[] = {1,2,3,4,5};
        mergeSort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}*/

/*Quick Sort
public class DividenConquer {
    public static void printArr(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void quickSort(int arr[], int si, int ei) {
        if(si >= ei) {
            return;
        }
        int pIdx = partition(arr, si, ei);
        quickSort(arr, si, pIdx - 1);
        quickSort(arr, pIdx + 1, ei);
    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1; //to make place for elements smaller than pivot

        for(int j = si; j < ei; j++) {
            if(arr[j] <= pivot) {
                i++;
                //swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        //swap pivot
        i++;
        int temp = arr[ei];
        arr[ei] = arr[i];
        arr[i] = temp;

        return i;
    }

    public static void main(String args[]) {
        int arr[] = {9,7,8,5,6};
        quickSort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}*/

/*Search in rotated sorted array
public class DividenConquer {
    public static int search(int arr[], int key, int si, int ei) {
        if(si > ei) {
            return -1;
        }
        int mid = si + (ei - si) / 2;
        if(arr[mid] == key) {
            return mid;
        }

        //left part is sorted
        if(arr[si] <= arr[mid]) {
            if(key >= arr[si] && key <= arr[mid]) {
                return search(arr, key, si, mid - 1);
            } else {
                return search(arr, key, mid + 1, ei);
            }
        }
        //right part is sorted
        else {
            if(key >= arr[mid] && key <= arr[ei]) {
                return search(arr, key, mid + 1, ei);
            } else {
                return search(arr, key, si, mid - 1);
            }
        }
    }
    public static void main(String args[]) {
        int arr[] = {4,5,6,7,0,1,2};
        int key = 0;
        int index = search(arr, key, 0, arr.length - 1);
        if(index == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("Key found at index: " + index);
        }
    }
}*/