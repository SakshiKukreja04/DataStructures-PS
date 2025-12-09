import java.util.*;

public class MaximumEle{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int max = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);

        //for printing maxRange
        int start = 0;
        int end = 3;
        int maxRange = Integer.MIN_VALUE;
        for(int i= start;i<end;i++){
            if(arr[i]>maxRange){
                maxRange=arr[i];
            }
        }
        System.out.println(maxRange);
    }
}