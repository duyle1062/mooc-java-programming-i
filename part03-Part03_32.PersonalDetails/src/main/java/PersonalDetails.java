
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        String longestName = "";
        int count = 0;
        int sumAge = 0;
        
        while (true) {
            String input = scanner.nextLine();
            
            if (input.equals("")) {
                break;
            }
            
            String[] pieces = input.split(",");
            if (pieces[0].length() > max) {
                max = pieces[0].length();
                longestName = pieces[0];
            }
            
            count++;
            sumAge += Integer.valueOf(pieces[1]);
        }
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + 1.0*sumAge/count);

    }
}
