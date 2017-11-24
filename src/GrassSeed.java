import java.util.*;
public class GrassSeed{
  public static void main(String[]args){
    Scanner scan = new Scanner(System.in);
    double c = scan.nextDouble();
    double l = scan.nextInt();
    double cost = 0;
    for(int i = 0; i < l; i++){
      double x = scan.nextDouble();
      double y = scan.nextDouble();
      cost += x*y;
    }
    System.out.println(cost*c);
    scan.close();
  }
}