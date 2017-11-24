import java.util.*;
public class SpeedLim{
  public static void main(String []args){
    Scanner scan = new Scanner(System.in);
    while(true){
      int n = scan.nextInt();
      if(n == -1) break;
      int miles = 0;
      int prev = 0;
      for(int i = 0; i < n;i++){
        int s = scan.nextInt();
        int t = scan.nextInt();
        miles += s * (t - prev);
        prev = t;
        
      }
      System.out.println(miles + " miles");
    }
    scan.close();
  }
}