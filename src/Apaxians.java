import java.util.*;
public class Apaxians{
  public static void main (String []args){
    Scanner scan = new Scanner(System.in);
    String s = scan.nextLine();
    String res = "";
    res += s.charAt(0);
    for(int i = 1; i < s.length(); i++){
      if(s.charAt(i) != s.charAt(i - 1)){
        res += s.charAt(i);
      }
    }
    System.out.println(res);
    scan.close();
  }
}