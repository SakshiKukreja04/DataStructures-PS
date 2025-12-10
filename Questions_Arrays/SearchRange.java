public class SearchRange{
    public static void main(String[] args){
        int[] arr ={18,12,-7,3,14,28};
        int target = 3;
        boolean ans = searchrange(arr,target);
        System.out.println(ans);
    }
    static boolean searchrange(int[] arr,int target){
        int start = 1;
        int end = 4;
        for(int i=start;i<=end;i++){
            if(arr[i]==target){
                return true;
            }

        }
        return false;
    }
}