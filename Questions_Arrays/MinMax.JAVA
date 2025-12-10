public class MinMax{
    public static void main(String[] args){
        int[] arr ={11,12,1,3,14,21,23,19};
        int min = Min(arr);
        int max = Max(arr);
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
    }
    static int Min(int[] arr){
        int min =Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    } 
    static int Max(int[] arr){
        int max =Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}