import java.util.*;
public class StringSearch{
    public static void main(String[] args){
        String str = "sakshi";

        System.out.println(Arrays.toString(str.toCharArray()));
        char target = 'k';
        boolean ans = stringsearch(str,target);
        System.out.println(ans);

    }
    static boolean stringsearch(String str , char target){
        if(str.length()==0){
            return false;
        }
        for(int i=0; i < str.length() ; i++){
            if(str.charAt(i)==target){
                return true;
            }
        }
        return false;
    }
    static boolean search2(String str , char target){
        if(str.length()==0){
            return false;
        }
        for(char ch : str.toCharArray()){
            if(ch==target){
                return true;
            }
        }
        return false;
    }
}