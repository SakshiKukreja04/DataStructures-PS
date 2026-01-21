public class reverse{
  public static void main(String[] args) {
    int n = reversenum(1234);
    System.out.println(n);
  }
  static int sum = 0;
  static int reversenum(int n){
    if(n==0){
      return sum;
    }
    int remainder =  n%10;
    sum = sum * 10 + remainder;
    return reversenum(n/10);
  }
}