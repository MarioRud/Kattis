import java.util.Scanner;
public class Bijele {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[6];
        for(int i = 0; i < 6; i++){
            array[i] = scan.nextInt();
        }
        int[] array1 = {1, 1, 2, 2, 2, 8};
        for(int i = 0; i < 6; i++){
            System.out.print(array[i] == array1[i] ? "0 " : (array1[i] - array[i]) + " " );
        }
        scan.close();
    }
    

}
