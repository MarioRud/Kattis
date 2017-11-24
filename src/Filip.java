import java.util.*;
public class Filip{
  public static void main(String[]args){
    Scanner scan = new Scanner(System.in);
    String x = scan.next();
    String y = scan.next();
    String x1 = "";
    String y1 = "";
    for(int i = x.length()-1 ; i >=0 ; i--){
      x1 += x.charAt(i);
    }
    for(int i = y.length()-1 ; i >=0 ; i--){
      y1 += y.charAt(i);
    }
    int x2 = Integer.parseInt(x1);
    int y2 = Integer.parseInt(y1);
    if(x2 > y2){
      System.out.println(x2);
    }
    else{
      System.out.println(y2);
    }
    scan.close();
  }
}