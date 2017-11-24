import java.util.Scanner;
public class DeathKnightHero {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int c = 0;
        for(int i = 0; i < n; i++){
           c+= (scan.next().indexOf("CD") == -1) ? 1 : 0;
        }
        System.out.println(c);
        scan.close();
    }

}
