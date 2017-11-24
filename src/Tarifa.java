import java.util.Scanner;
public class Tarifa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int n = scan.nextInt();
        int bytes = x;
        for(int i = 0; i < n; i++){
            int used = scan.nextInt();
            bytes = (bytes - used) + x;
        }
        System.out.println(bytes);
        scan.close();
        
    }

}
