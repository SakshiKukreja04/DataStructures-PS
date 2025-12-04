public class sumOfArray{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int res = 0;
        for(int i=0;i<arr.length;i++){
            res = res + arr[i];
        }
        System.out.println("The sum of elements in the array is: " + res);
    }
}