package jmu.zuo.MergeSort;

import jmu.zuo.ArrayForUse;

public class MergeSort {
    public static void main(String[] args) {

        int[] arr = ArrayForUse.toGetArray();

        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j] + " ");
        }

        process(arr,0,ArrayForUse.MAXSIZE - 1);

        System.out.println("===============");

        for(int i=0; i < arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("===============");

    }

    public static void process(int[] arr,int L,int R){
        if(L==R){
            return;
        }
        int mid = L + ((R - L) >> 1);
        process(arr, L, mid);
        process(arr, mid+1, R);
        merge(arr,L,mid,R);
    }

    public static void merge(int[] arr,int L,int M,int R){
        int[] help = new int[R - L + 1];
        int i = 0;
        int p1 = L;
        int p2 = M+1;
        while(p1 <= M && p2 <= R){
            help[i++]  = arr[p1] < arr[p2] ? arr[p1++] : arr[p2++];
        }
        while(p1<=M){
            help[i++] = arr[p1++];
        }
        while (p2<=R){
            help[i++] = arr[p2++];
        }

        for(int j=0; j<help.length; j++){
            arr[L + j] = help[j];
        }
    }
}
