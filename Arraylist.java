import java.util.ArrayList;
import java.util.Scanner;
public class Arraylist{
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>(10);

        Scanner sc = new Scanner(System.in);


        // list.add(77);
        // list.add(87);
        // list.add(97);
        // list.add(67);
        // list.add(77);
        // list.add(87);
        // list.add(97);
        // list.add(67);
        // list.add(77);
        // list.add(87);
        // list.add(97);
        // list.add(67);

        // System.out.println(list.contains(97));
        // System.out.println(list.set(0,100));
        // list.remove(2);
        // System.out.println(list);

        //input
        for(int i=0;i<5;i++){
            list.add(sc.nextInt());
        }

        //output use get item to get value at any index
        for(int i=0;i<5;i++){
            System.out.println(list.get(i));
        }



    }
}