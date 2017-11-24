import java.util.Scanner;
public class Oddities {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < array.length; i++){
            array[i] = scan.nextInt();
        }
        for(int j = 0; j < array.length; j++){
            if(array[j]%2 == 0){
                System.out.println(array[j] + " is even");
            }
            else{
                System.out.println(array[j] + " is odd");
            }
        }
        scan.close();
        
    }
    
}