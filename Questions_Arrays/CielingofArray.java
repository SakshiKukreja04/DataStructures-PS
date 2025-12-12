public class CielingofArray{
    public static void main(String[] args){
            
        int[] arr = {1,2,3,4,5,7,8,9,10};
        int target = 6;
        int result = cielingofarray(arr,target);
        System.out.println(result);
    }
    static int cielingofarray(int[] arr,int target){
        int start=0;
        int end = arr.length -1;
        while(start <= end){
            int mid = (start + end)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return start;
    }
}