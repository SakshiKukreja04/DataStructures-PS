package easy;

public class fact {
  public static void main(String[] args) {
    int n = 5;
    int result = facto(n);
    System.out.println("Factorial of " + n + " is: " + result);
  }
  public static int facto(int n){
    if(n==0){
      return 1;
    }
    return n* facto(n-1);
  }
}
