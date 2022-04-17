package jmu.zuo;

import java.util.Arrays;

public class QuickSort {
    public static void quickSort(int[] arr){
        if(arr == null || arr.length < 2)
            return;
        quickSort(arr,0,arr.length-1);
    }

    public static void quickSort(int[] arr,int L,int R){
        if(L < R){
            int[] p = partition(arr,L,R);
            quickSort(arr,L,p[0] - 1);
            quickSort(arr,p[1] + 1,R);
        }
    }

    public static int[] partition(int[] arr,int L,int R){
        int min = L - 1;
        int max = R;
        int num = arr[R];
        while(L < max){
            if(arr[L]<num){
                swap(arr,L++,++min);
            }else if(arr[L]>num){
                swap(arr,L,--max);
            }else{
                L++;
            }
        }
        swap(arr,max,R);
        return new int[] {min+1,max};
    }

    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {2,4,5,19,1,7,9,7,6,0,3,7};
        quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
