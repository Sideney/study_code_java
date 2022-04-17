package jmu.day1.demo2;


/*
数组元素的反转：
本来：【1,2,3,4】
之后：【4,3,2,1】

要求不能使用新数组
 */
public class Demo02ArrayReverse {
    public static void main(String[] args) {
        int[] array = {10,20,30,40,40,50,50};

        //原本数组
        printArray(array);
        System.out.println("===============");
        /*
        初始化语句：int min=0，max=length-1；
        条件判断：min<max；
        步进表达式：min++，max--；
         */
        int temp;
        //反转后数组
        for(int min=0,max=array.length-1;min<max;min++,max--){
            temp = array[min];
            array[min] = array[max];
            array[max] = temp;
        }
        printArray(array);

    }

    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }


}
