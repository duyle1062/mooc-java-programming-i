
import java.util.Scanner;

public class Orwell {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a year:");
        int value = Integer.valueOf(scan.nextLine());
        if (value < 2015) {
            if (value == 1984) {
                System.out.println("Orwell");
            } else {
                System.out.println("Ancient history!");
            }
        } 
    }
}
