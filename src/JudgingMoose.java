import java.util.Scanner;
public class JudgingMoose {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int l = scan.nextInt();
        int r = scan.nextInt();
        if(l > r){
            System.out.println("Odd " + (l*2));
        }
        else if(l < r){
            System.out.println("Odd " + (r*2));
        }
        else if(l == r && (l > 0 || r > 0)){
            System.out.println("Even " + (r*2));
        }
        else if(l == 0 || r == 0){
            System.out.println("Not a moose");
        }
        scan.close();
    }

}
