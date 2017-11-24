import java.util.*;
public class Bela{
  public static void main(String []args){
    Scanner scan = new Scanner(System.in);
    int hands = scan.nextInt();
    String dominant = scan.next();
    int sum = 0;
    
    int[] dom = {11, 4, 3, 20, 10, 14};
    int[] non = {11, 4, 3, 2, 10, 0};
    
    for(int i = 0; i < hands*4; i++){
      String card = scan.next();
      String value = card.substring(0, 1);
      String suit = card.substring(1);
      
      if(value.equals("A")){
        sum += non[0];
      }
      else if(value.equals("K")){
        sum += non[1];
      }
      else if(value.equals("Q")){
        sum += non[2];
      }
      if(value.equals("J") && suit.equals(dominant)){
        sum += dom[3];
      }
      else if(value.equals("J")){
        sum += non[3];
      }
      else if(value.equals("T")){
        sum += non[4];
      }
      else if(value.equals("9") && suit.equals(dominant)){
        sum += dom[5];
      }
    
    }
    System.out.println(sum);
    scan.close();
  }
}