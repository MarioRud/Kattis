import java.util.*;
public class RevBinary{
  public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        int originalNum = Integer.parseInt(scan.nextLine());
            String binaryString = Integer.toBinaryString(originalNum);
            String reverseBinaryString = "";
            int binLen = binaryString.length();
            for (int i = 0; i < binLen; i++) {
            reverseBinaryString += binaryString.charAt(binLen - i - 1);
            }

            int newNum = Integer.parseInt(reverseBinaryString, 2);

            System.out.println(Integer.toString(newNum));
            scan.close();
  }
}