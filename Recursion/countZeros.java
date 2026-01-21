public class countZeros {
  public static void main(String[] args) {
    int n = count(1000);
    System.out.println(n);
  }
  static int sum = 0;
  static int count(int n){
    if(n==0){
      return sum;
    }
    int digit = n%10;
    if(digit == 0){
      sum++;
    } 
    return count(n/10);
  }
}
