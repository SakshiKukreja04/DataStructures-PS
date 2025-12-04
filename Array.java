import java.util.*; 
public class Array {
    public static void main(String[] args) {
        // int[] arr = {1,2,3,4,5,6,-7,8,9,10};
        Scanner sc = new Scanner(System.in);
        // int res = Integer.MIN_VALUE;
        // for(int i=0;i<arr.length;i++){
        //     if (arr[i] > res){
        //         res = arr[i];
        //     }
        // }
        // System.out.println("The largest element in the array is: " + res);
        //primitives 
        // int[] newArr = new int[5];
        
        // for(int i=0;i<newArr.length;i++){
        //      newArr[i] = sc.nextInt();
        // }
        // for(int i=0;i<newArr.length;i++){
        //     System.out.print(newArr[i]+ " ");
        // }
        // for(int num : newArr){//for every new element in newArr,print the element
        //     System.out.print(num + " ");
        // }

        //m3
        // System.out.print(Arrays.toString(newArr));

        //Objects
        String[] str = new String[3];

        for(int i=0; i < str.length; i++){
            str[i] = sc.next();
        }
        System.out.print(Arrays.toString(str));

        str[2]="sakshi";
        System.out.print(Arrays.toString(str));

    }
}
