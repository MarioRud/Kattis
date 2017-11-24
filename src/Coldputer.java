import java.util.Scanner;
public class Coldputer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int count = 0;
        for(int i = 0; i < n; i++){
            int x = scan.nextInt();
            if(x < 0){
                count++;
            }
        }
        System.out.println(count);
        scan.close();
    }

}
