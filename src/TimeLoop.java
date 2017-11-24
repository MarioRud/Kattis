import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class TimeLoop
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int num;
        System.out.println("Input?");
        num = scan.nextInt();
        while ((num < 1 || num > 100)){
            System.out.println("Sorry invalid input, must be 1<=x<=100"); 
            num = scan.nextInt();
        }

        for(int i=1; i<=num; i++)
        {
            System.out.println(i + " Abracadabra");
        }
        scan.close();

    }

}