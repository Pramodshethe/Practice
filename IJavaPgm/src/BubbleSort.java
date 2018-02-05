public class BubbleSort {
    static void bubblesort(int[] arr){
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i <n ; i++){
            for (int j = 1; j < (n-i);j++){
                if(arr[j-1] > arr[j]){
                    temp = arr[j-1];
                    arr[j-1]  = arr[j];
                    arr[j] = temp;
                }
            }
        }

    }

    public static void main(String[] args) {
        int arr[] = {23,4,5,6,35,54};
        System.out.println("Array before Bubble sort");
        for (int i = 0; i <arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        bubblesort(arr);
        System.out.println("Array after the Bubble Sort: ");
        for (int i = 0; i <arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
