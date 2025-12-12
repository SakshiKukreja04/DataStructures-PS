public class InfiniteArray{
    public static void main(String[] args){
        int[] arr = {3,5,7,9,10,90,100,130,140,160,170};
        int target = 10;
        int result = ans(arr,target);
        System.out.println(result);
    }
    static int ans(int[] arr,int target){
        //first find the range
        //first start with a box of size 2
        int start =0;
        int end = 1;
        //condition for the target to lie in the range
        while(target > arr[end]){
            int newStart = end + 1;
            //we need to double the box value
            // end = previousend +(end - start + 1)*2
            end = end + (end - start + 1)*2;
            start = newStart;
        }
        return binarysearch(arr,target,start,end);
    }
    static int binarysearch(int[] arr,int target,int start,int end){
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
        return -1;
    }
}