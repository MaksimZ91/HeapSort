package org.example;

public class Sort {
    public void heapSort(int[] arr){
        int size = arr.length;
        for (int i = size/2-1; i >= 0; i--){
            heapify(arr, size, i);
        }
        for (int j = size-1; j >=  0; j--) {
            int tmp = arr[0];
            arr[0] = arr[j];
            arr[j] = tmp;
            heapify(arr,j, 0);
        }
    }

    private void heapify(int[]arr, int size, int index){
        int largest = index;
        int left = 2 * index + 1;
        int right = 2 * index + 2;
        if (left < size && arr[left] > arr[largest])
            largest = left;
        if (right < size && arr[right] > arr[largest])
            largest = right;
        if (largest != index){
            int tmp = arr[index];
            arr[index] = arr[largest];
            arr[largest] = tmp;
            heapify(arr, size, largest);
        }
    }

}

