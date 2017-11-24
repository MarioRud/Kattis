import java.util.*;
public class NastyHacks{
  public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i = 0; i < n; i++){
          int noadv = scan.nextInt();
          int adv = scan.nextInt();
          int cost = scan.nextInt();
          
          if((adv - cost) > noadv){
            System.out.println("advertise");
          }
          else if((adv - cost) < noadv){
            System.out.println("do not advertise");
          }
          else{
            System.out.println("does not matter");
          }
        }
        scan.close();
        
  }
}