package jmu.zuo.MergeSort;

import jmu.zuo.ArrayForUse;

/*
* 小和问题：
* 在一个数组中，每一个数左边比当前数小的数累加起来，叫做这个数组的小和。求一个数组的小和。
* */
public class SmallSum {
    public static void main(String[] args) {
        int[] arr = ArrayForUse.toGetArray();
        for(int i: arr){
            System.out.print(i + " ");
        }
        int process = process(arr, 0, ArrayForUse.MAXSIZE - 1);
        System.out.println(process+" ");

    }

    public static int process(int[] arr,int L,int R){

        if(L==R){
            return 0;
        }
        int mid = L + ((R-L)>>1);
        return process(arr,L,mid) + process(arr,mid + 1, R) + merge(arr,L,mid,R);
    }

    static int merge(int[] arr,int L,int mid,int R){
        int[] help = new int[R - L +1];
        int p1 = L;
        int p2 = mid + 1;
        int i = 0;
        int res=0;

        while (p1<=mid&&p2<=R){
            res += arr[p1] < arr[p2] ? (R - p2 + 1) * arr[p1] : 0;
            help[i++] = arr[p1] < arr[p2] ? arr[p1++] : arr[p2++];
        }
        while(p1 <= mid){
            help[i++] = arr[p1++];
        }
        while (p2 <= R){
            help[i++] = arr[p2++];
        }
        for(i = 0; i < help.length; i++){
            arr[L + i] = help[i];
        }
        return res;
    }
}
