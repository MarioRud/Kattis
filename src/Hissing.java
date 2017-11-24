import java.util.Scanner;
public class Hissing {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        int count = 0;
        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) == 's'){
                count++;
            }
            else{
                count = 0;
            }
            if(count == 2){
                break;
            }
        }
        if(count == 2){
            System.out.println("hiss");
        }
        else{
            System.out.println("no hiss");
        }
        scan.close();
    }

}
