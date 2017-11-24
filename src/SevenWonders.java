import java.util.Scanner;
public class SevenWonders {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int t = 0, c = 0, g = 0;
        int smallest = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i)== 'T'){            
                t++;
            }
            else if(s.charAt(i)== 'C'){           
                c++;
            }
            if(s.charAt(i)== 'G'){
                g++;
            }
            
        }
        if(t <= c && t <= g){
            smallest = t;
        }
        else if(c <= g){
            smallest = c;
        }
        else{
            smallest = g;
        }
        t = t*t;
        c = c*c;
        g = g*g;
        
        System.out.println((7*smallest)+ t + c + g);
        scan.close();
        
    }

}