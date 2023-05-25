package org.example;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] array = {2,6,8,1,7,9,9,3,7,-9,255,-999};
        Sort sr = new Sort();
        sr.heapSort(array);
        System.out.println(Arrays.toString(array));

        }
}


