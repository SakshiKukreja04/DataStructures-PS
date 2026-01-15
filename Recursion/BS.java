public class BS {
  public static void main(String[] args) {

    int [] arr = {2,4,6,8,10,12,14,16,18};
    int target = 14;
    int result = binarySearch(arr,target,0,arr.length -1);
    System.out.println("Element found at index: " + result);
    
  }
  static int binarySearch(int[] arr,int target,int s,int e){
    if(s>e){
      return -1;
    }
    int mid = s + (e - s)/2;
    if(arr[mid] == target){
      return mid;
    }
    if(target < arr[mid]){
      return binarySearch(arr, target, s, mid -1);

    }
    return binarySearch(arr, target, mid + 1, e);
  }
}
