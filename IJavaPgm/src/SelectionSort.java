public class SelectionSort {
    static void selectionsort(int[] arr){
        for (int i = 0; i < arr.length; i++){
            int index = i;
            for (int j = i+1; j<arr.length; j++){
                if(arr[j] < arr[index]){
                    index = j;
                }
            }
                int smallno = arr[index];
            arr[index] = arr[i];
            arr[i] = smallno;
        }
    }

    public static void main(String[] args) {
        int[] arr = {12,3,35,232,434,-3,213};
        System.out.println("Array before Sorting");
        for (int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        selectionsort(arr);
        System.out.println("Array after Sorting");
        for (int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
