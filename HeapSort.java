
public class HeapSort {

    public HeapSort() {
    }

    private void heapify(int[] arr, int heapSize, int rootIndex) {
        int max = rootIndex;
        int left = 2 * rootIndex + 1;
        int right = 2 * rootIndex + 2;
        if(left < heapSize && arr[left] > arr[max]) {
            max = left;
        } 
        if(right < heapSize && arr[right] > arr[max]) {
            max = right;
        } 
        if(max != rootIndex) {
            int temp = arr[rootIndex];
            arr[rootIndex] = arr[max];
            arr[max] = temp;
            heapify(arr, heapSize, max);
        }
    }

    public void sort(int[] arr) {
        // построение кучи
        for(int i = arr.length / 2 -1; i >= 0; i--) {
            heapify(arr, arr.length, i);
        }

        for(int i = arr.length -1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
    }

}