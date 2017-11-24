import java.util.Scanner;
public class Autori {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String full = scan.nextLine();
        String s = "";
        for(int i = 0; i < full.length(); i++){
            if(Character.isUpperCase(full.charAt(i))){
                s += full.charAt(i);
            }
        }
        System.out.println(s);
        scan.close();
    }

}
