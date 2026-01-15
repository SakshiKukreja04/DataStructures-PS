public class numberexample{
  public static void main(String[] args){

    printNumbers(1);
  }
  static void printNumbers(int n){
    //base case
    if(n==5){
      System.out.println(5);
      return;
    }
    //if we call a function again and again it will take separate copies in memory
    System.out.println(n);
    printNumbers(n+1);
  }
}