import java.util.Scanner;
public class BatterUp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        double res = 0;
        int[] array = new int[n];
        for(int i = 0; i < array.length; i++){
            array[i] = scan.nextInt();
        }
        for(int i = 0; i < array.length; i++){
            if(array[i] == -1){
                n--;
            }
            else{
                res += array[i];
            }
        }
        System.out.println(res/n);
        scan.close();
    }
    

}
