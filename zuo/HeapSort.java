package jmu.zuo;

import java.util.Arrays;

public class HeapSort {

    public static void heapSort(int[] arr){
        if(arr == null || arr.length < 2)
            return;;
        for(int i : arr){
            heapInsert(arr,i);
        }
        int heapSize = arr.length - 1;
        while(heapSize > 0){
            swap(arr,0,heapSize);
            heapify(arr,0,heapSize--);
        }
    }

    //建立大根堆
    public static void heapInsert(int[] arr,int i){
        while(arr[i]>arr[(i - 1) / 2]){
            swap(arr,i,(i - 1) / 2);
            i = (i - 1) / 2;
        }
    }

    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    //调整大根堆
    public static void heapify(int []arr,int index,int heapSize){
        int left = index * 2 + 1;
        while(left < heapSize){
            int largest = left + 1 < heapSize && arr[left + 1] > arr[left] ? left + 1 : left;
            largest = arr[largest] > arr[index] ? largest : index;
            if(largest == index){
                break;
            }
            swap(arr,largest,index);
            index = largest;
            left = index * 2 + 1;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5,5,2,8,6,1,4,0,9,1,7};
        heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
