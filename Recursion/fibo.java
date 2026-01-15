public class fibo{
  public static void main(String[] args){
    int n = 7;
    System.out.println(fibonacci(n));
  }
  static int fibonacci(int n){
    //base condition
    if(n<2){
      return n;
    }
    return fibonacci(n-1) + fibonacci(n-2);
  }
}