public class Operators{
    public static void main(String[] args){
        System.out.println("a"+"b");
        System.out.println('a'+ 'b');
        System.out.println((char)('a' + 3));
        System.out.println('A'-'0');
        System.out.println('A');
        System.out.println('0');

        System.out.println("a"+1);
        //this is same as after a few steps "a" + "1"
        //integer will be converted to Integer that will call toString();

        // System.out.println("sakshi" + new ArrayList<>());
        // System.out.println("sakshi" + new Integer(55));
        int num =25;
        System.out.println((char)('A'+num));
    }
}