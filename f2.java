import java.util.Scanner;
public class f2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    if (x<=0 || y<=0) {
      System.out.println(0);
      return;
    }
    int chuvi = (x+y)*2;
    int dientich = (x*y);
    System.out.println(chuvi + " " + dientich);
  }
}
