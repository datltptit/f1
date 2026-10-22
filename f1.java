import java.util.Scanner;
public class f1 {
  public static void main(String[]args) {
    Scanner sc = new Scanner(System.in);
    if (sc.hasNext()) {
      int m = sc.nextInt();
      while (m-- >0){
        long n = sc.nextInt();
        long p = n*(n+1)/2;
        System.out.println(p);
      }
    }
    sc.close();
  }
}
