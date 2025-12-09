import java.util.*;

public class ArrayListMulti{
    public static void main(String[] args){
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        //intialization
        for(int i=0;i<3;i++){
            list.add(new ArrayList<>());
        }

        //adding elements
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                list.get(i).add(sc.nextInt());
            }
        }
        System.out.println(list);//multidimensional arraylist can also be printed directly
    }
}