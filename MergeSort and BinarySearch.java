class Main {
    private static void mergeSort(int[] arr) {
        int length = arr.length;

        if(length<2) {
            return;
        }

        int mid = length/2;
        
        int[] left = new int[mid];
        int[] right = new int[length-mid];

        for(int i=0;i<mid;i++) {
            left[i] = arr[i];
        }

        for(int i=mid;i<length;i++) {
            right[i-mid] = arr[i];
        }

        mergeSort(left);
        mergeSort(right);
        merge(arr,left,right);
    }

    private static void merge(int[] arr, int[] left, int[] right) {
        int leftSize = left.length;
        int rightSize = right.length;

        int i=0, j=0, k=0;

        while(i<leftSize && j<rightSize) {
            if(left[i]<=right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        while(i<leftSize) {
            arr[k] = left[i];
            i++;
            k++;
        }

        while(j<rightSize) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }

    private static boolean binarySearch(int[] arr, int searchElement) {
        int start = 0;
        int end = arr.length-1;
        
        while(start<=end){
            int midElement = start+(end-start)/2;
            if(arr[midElement]==searchElement) {
                return true;
            } else if(arr[midElement]<searchElement) {
                start = midElement+1;
            } else {
                end = midElement-1;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int arr[] = {88,4,74,65,83,2,1,5,398};

        System.out.println("Before Sorting Array: ");
        for(int n : arr) {
            System.out.print(n + " ");
        }
        mergeSort(arr);

        System.out.println();
        System.out.println("After Sorting Array: ");
        for(int n : arr) {
            System.out.print(n + " ");
        }

        System.out.println();

        System.out.println("88 founded? :" + binarySearch(arr,88));
        System.out.println("101 founded? :" + binarySearch(arr,101));
    }
}