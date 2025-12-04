public class Array2D{
    public static void main(String[] args){
        int[][] arr = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
        
        char[][] arr2 = new char[3][2];

        arr2[0][0] = 'a';
        arr2[0][1] = 'b';
        arr2[1][0] = 'c'; 
        arr2[1][1] = 'd';
        arr2[2][0] = 'e';
        arr2[2][1] = 'f';

        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr2[i].length;j++){
                System.out.print(arr2[i][j]+ " ");
            }
            System.out.println();
        } 

        //jagged array
        int[][] jagged = new int[2][];

        jagged[0] = new int[3];
        jagged[1] = new int[2];
        jagged[0][0] = 2;
        jagged[0][1] = 3;
        jagged[0][2] = 4;
        jagged[1][0] = 5;
        jagged[1][1] = 6;

        for(int i=0;i<jagged.length;i++){
            for(int j=0;j<jagged[i].length;j++){
                System.out.print(jagged[i][j]+ " ");
            }
            System.out.println();
        } 


        
    }
}

// a b
// c d
// e f

// 2 3 4
// 5 6