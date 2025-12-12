public class LinearSearch{
    public static void main(String[] args){
        int[] arr = {18,12,9,14,77,50};
        //find whether 14 is present in array or not
        int target = 14;
        boolean ans = linearsearch(arr,target);
        System.out.println(ans);
    }
    static boolean linearsearch(int[] arr, int target){
        for(int i=0;i<arr.length;i++){
            if(arr.length==0){
                return -1;
            }
            if(arr[i]==target){
                return true;
            }
        }
        return false;
    }
}