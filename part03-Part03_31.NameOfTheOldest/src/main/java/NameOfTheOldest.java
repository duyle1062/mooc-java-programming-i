
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldestAge = 0;
        String oldestName = "";
        while (true) {
            String input = scanner.nextLine();
            
            if (input.equals("")) {
                break;
            }
            
            String[] pieces = input.split(",");
            if (Integer.valueOf(pieces[1]) > oldestAge) {
                oldestAge = Integer.valueOf(pieces[1]);
                oldestName = pieces[0];
            }
        }
        System.out.println("Name of the oldest: " + oldestName);

    }
}
