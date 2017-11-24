import java.util.*;
public class Zamka{
  public static int sumDigits(int x){
      int sum = 0;
      while(x != 0){
          sum += x%10;
          x = x/10;
      }
      return sum;
  }
  public static void main(String []args){
    Scanner scan = new Scanner(System.in);
    int l = scan.nextInt();
    int d = scan.nextInt();
    int x = scan.nextInt();
    for(int i = l; i <= d;i++){
      if(sumDigits(i) == x){
        System.out.println(i);
        break;
      }
    }
    for(int i = d; i >= l;i--){
      if(sumDigits(i) == x){
        System.out.println(i);
        break;
      }
    }
    scan.close();
    
  }
}