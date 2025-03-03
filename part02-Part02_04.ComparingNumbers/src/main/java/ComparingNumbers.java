
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numb1 = Integer.valueOf(scanner.nextLine());
        int numb2 = Integer.valueOf(scanner.nextLine());
        if (numb1 > numb2) {
            System.out.println(numb1 + " is greater than " + numb2);
        } else if (numb1 < numb2) {
            System.out.println(numb1 + " is smaller than " + numb2);
        } else {
            System.out.println(numb1 + " is equal to " + numb2);
        }
    }
}
