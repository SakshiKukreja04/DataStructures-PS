package easy;

public class onetoN {
  public static void main(String[] args) {
    int n = 5;
    print1toN(n);

    
  }
  public static void print1toN(int n){
    if(n==1){
      System.out.println(1);
      return;
    }
    print1toN(n-1);
    System.out.println(n);
  }
}
