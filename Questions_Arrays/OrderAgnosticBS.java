public class OrderAgnosticBS{
    public static void main(String[] args){
        int[] arr = {119,17,13,7,5,4,3,2,1,-1,-10};
        int target = 7;
        int result = binarysearch(arr,target);
        System.out.println(result);
    }
        
    static int binarysearch(int[] arr,int target){
        int start = 0;
        int end = arr.length -1;

        boolean isAsc = arr[start] < arr[end];

        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(isAsc){
                if(arr[mid]<target){
                start = mid + 1;
                }
                else{
                end = mid - 1;
                }
            }
            else{
                if(arr[mid]>target){
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}