
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            
            if (input.equals("")) {
                break;
            }
            
            String[] pieces = input.split(" ");
            for (String str : pieces) {
                if (str.indexOf("av") != -1) {
                    System.out.println(str);
                }
            }
        }

    }
}
