import java.util.Scanner;
public class Pot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int res = 0;
        for(int i = 0; i < n; i++){
            int p = scan.nextInt();
            res += Math.pow(p/10,p%10);
        }
        System.out.println(res);
        scan.close();
        
    }
    

}
