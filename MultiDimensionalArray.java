import java.util.*;
public class MultiDimensionalArray{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][];
        // int[][] arr = {
        //     {1,2,3},//0th index
        //     {4,5},//1st index
        //     {6,7,8,9}  //2nd index
        // };
        System.out.println(arr.length);//no of rows
        System.out.println(arr[0].length);//no of columns in 0th row


        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        for(int i=0;i<arr.length;i++){
            System.out.println(Arrays.toString(arr[i]));
        }

       

    }
}